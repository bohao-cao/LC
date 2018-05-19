package LeetCode.flattenNestedListIterator;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class NestedIterator2 implements Iterator<Integer> {
    //Important, queue is of type integer, which stores the flattened integers in the order of the flattening.
    private Queue<NestedInteger> q = new ArrayDeque<>();
    private List<NestedInteger> nestedList;
    private int count = 0;

    public NestedIterator2(List<NestedInteger> nestedList) {
        if(nestedList==null)
            return;
        if(nestedList.size() == 0)
            return;
        this.nestedList = nestedList;
        q.add(this.nestedList.get(count));
    }
    private int next;

    @Override
    public boolean hasNext() {
         while(!q.isEmpty()){
             NestedInteger nestedInteger = q.poll();
             if(nestedInteger.isInteger()){
                 next = nestedInteger.getInteger();
                 if(q.isEmpty()) {
                     count++;
                     if(count< nestedList.size())
                        q.add(nestedList.get(count));
                 }
                 return true;
             }
             for(NestedInteger i: nestedInteger.getList()){
                 q.add(i);
             }
         }
         return false;
    }

    @Override
    public Integer next() {
        return next;
    }
}
