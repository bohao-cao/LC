package LeetCode.mergeIntervals;
import java.util.*;

class Solution {
    private class IntervalComparator implements Comparator<Interval>{

        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start < o2.start ? -1: o1.start == o2.start?0:1;
        }
    }
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals == null)
            return null;
        if(intervals.size() == 0)
            return new ArrayList<>();

        Collections.sort(intervals, new IntervalComparator());
        //intervals = sortByStart(intervals);

        List<Interval> res = new ArrayList<>();
        res.add(intervals.get(0));

        for(int i=1;i< intervals.size();i++){
                Interval i1 = res.get(res.size()-1);
                Interval i2 = intervals.get(i);

            if(i2.start >= i1.start && i2.end <= i1.end)
                continue;
            else if(i2.start<=i1.start && i2.end >= i1.end){
                res.set(res.size()-1,i2);
            }

            else if(i2.start>=i1.start && i2.start <= i1.end && i2.end> i1.end){
                Interval n = new Interval(i1.start, i2.end);
                res.set(res.size()-1, n);
            }

            else if(i2.start > i1.end){
                res.add(i2);
            }

        }

        return res;

    }
}