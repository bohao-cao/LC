package Amazon.runningMedian;

import java.util.*;

public class Solution {
    // This solution is so intuitive that it exceeds time limit
    double[] runningMedian(int[] a) {
        /*
         * Write your code here.
         */
        List<Integer> l = new LinkedList();
        List<Double> res = new ArrayList();
        for(int i: a){
            if(l.isEmpty()){
                l.add(i);
                res.add((double)i);
                continue;
            }

            int k = 0;
            while(k < l.size() && l.get(k)<i)
                k++;
            l.add(k, i);

            double median = l.size()%2==1? (double)l.get(l.size()/2)
                    : (double)(l.get(l.size()/2-1) + l.get(l.size()/2))/2;
            res.add(median);
        }

        double[] r = new double[res.size()];
        int i=0;
        for(double d: res){
            r[i++] = d;
        }

        return r;
    }
}
