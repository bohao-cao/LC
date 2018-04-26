package LeetCode.flattenNestedListIterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
class NestedIteratorTest {

    private class MyNestedInteger implements LeetCode.flattenNestedListIterator.NestedInteger {

        @Override
        public boolean isInteger() {
            return _n!=0;
        }

        @Override
        public Integer getInteger() {
            return _n;
        }

        @Override
        public List<LeetCode.flattenNestedListIterator.NestedInteger> getList() {
            return _list;
        }
        private List<NestedInteger> _list;
        private int _n;
        public MyNestedInteger(List<NestedInteger> list){
            _list = list;
        }
        public MyNestedInteger(int n){
            _n=n;
        }


    }

    @Test
    public void test1() {
        //[[1,1],2,[1,1]]
        NestedInteger n1 = new MyNestedInteger(1);
        NestedInteger n2 = new MyNestedInteger(1);
        List<NestedInteger> l1 = new ArrayList<>();
        l1.add(n1);
        l1.add(n2);
        NestedInteger item1 = new MyNestedInteger(l1);
        NestedInteger itme2 = new MyNestedInteger(2);
        NestedInteger n4 = new MyNestedInteger(1);
        NestedInteger n5 = new MyNestedInteger(2);
        List<NestedInteger> l2 = new ArrayList<>();
        l2.add(n4);
        l2.add(n5);
        NestedInteger item3 = new MyNestedInteger(l2);
        List<NestedInteger> input = new ArrayList<>();
        input.add(item1);
        input.add(itme2);
        input.add(item3);

        Iterator<Integer> solution = new NestedIterator2(input);

        List<Integer> flatten = new ArrayList<>();

        while(solution.hasNext())
            flatten.add(solution.next());
        flatten.toString();

    }
}
