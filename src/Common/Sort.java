package Common;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Sort {
    private class MyComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer a, Integer b) {
            return a==b ? 0 : a > b? -1: 1;
        }
    }
    @Test
    public void studySortArrayWithLambdaComparator(){
        Integer[] input = new Integer[]{3,2,5,4,7,1,8};

        //Default sort, ascending
        Arrays.sort(input);
        //Use lambda, descending
        Arrays.sort(input, (a,b)-> a==b ? 0 : a > b? -1: 1);
        //Same
        Arrays.sort(input, new MyComparator());

        List<Integer> input1 = new ArrayList(Arrays.asList(input));

        //ascending
        input1.sort((a,b)-> a==b ? 0 : a > b? 1: -1);

        //descending
        input1.sort((a,b)-> a==b ? 0 : a > b? -1: 1);
    }

    @Test
    public void studyMaxHeapAndminHeapSorting(){
        Integer[] input = new Integer[]{3,2,5,4,7,1,8};
        //MaxHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a==b ? 0 : a > b? -1: 1);

        for(int i: input){
            pq.add(i);
        }

        List<Integer> res = new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }

        int x = 0;

    }
}
