package LeetCode.flattenNestedListIterator;

import java.util.*;

/*Given a nested list of integers, implement an iterator to flatten it.

        Each element is either an integer, or a list -- whose elements may also be integers or other lists.

        Example 1:
        Given the list [[1,1],2,[1,1]],

        By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].

        Example 2:
        Given the list [1,[4,[6]]],

        By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].*/
public class NestedIterator implements Iterator<Integer> {

    private List<NestedInteger> _nestedList;
    private Queue<NestedInteger> _q;
    private int count=0;
    public NestedIterator(List<NestedInteger> nestedList) {
        if(nestedList == null || nestedList.size()==0)
            isLast = true;
        _nestedList = nestedList;

        _q = new ArrayDeque<>();
        NestedInteger item0 = nestedList.get(count);
         _q.add(item0);
    }
    private boolean isLast;

    @Override
    public Integer next() {
        if(count > _nestedList.size())
            throw new ArrayIndexOutOfBoundsException("oob");
        if(_q.isEmpty() && count < _nestedList.size()){
            count++;
            NestedInteger item = _nestedList.get(count);
            _q.add(item);
        }
        NestedInteger i = _q.poll();
        if(!i.isInteger()){
            List<NestedInteger> l = i.getList();
            for(NestedInteger item: l)
                _q.add(item);
            return next();
        }
        if(_q.isEmpty() && count == _nestedList.size()-1)
            isLast = true;
        return i.getInteger();

    }

    @Override
    public boolean hasNext() {
        return !isLast;
    }
}