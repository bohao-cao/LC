package Amazon.runningMedian;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueSolution {
    private class DescendingComparator implements Comparator<Double> {
        @Override
        public int compare(Double o1, Double o2) {
            return o1 < o2 ? 1 : o1==o2? 0:-1;
        }
    }

    public List<Double> studyPR(double[] input, boolean isDesc){
        PriorityQueue<Double> heap = isDesc ? new PriorityQueue(new DescendingComparator()) : new PriorityQueue<>();
        for(double i:input)
            heap.add(i);
        List<Double> res = new ArrayList();
        while(!heap.isEmpty())
        {
            res.add(heap.poll());
        }
        return res;
    }

    double[] runningMedian(int[] a) {
        //max heap stores smaller half of a[];
        PriorityQueue<Double> smallerHalf = new PriorityQueue<>(new DescendingComparator());
        //min heap stores larger half of a[];
        PriorityQueue<Double> largerHalf = new PriorityQueue<>();
        double[] res = new double[a.length];
        int c =0;
        for(int i: a){
            smallerHalf.add((double)i);
            largerHalf.add(smallerHalf.poll());
            if(smallerHalf.size() < largerHalf.size())
                smallerHalf.add(largerHalf.poll());
            res[c++] = largerHalf.isEmpty() || smallerHalf.size()-largerHalf.size() == 1? smallerHalf.peek(): (smallerHalf.peek() + largerHalf.peek())/2;
        }

        return res;


    }
}
