package LeetCode.mergeIntervals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void merge() {
        Solution s= new Solution();
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(1,3));
        input.add(new Interval(2,6));
        input.add(new Interval(8,10));
        input.add(new Interval(15,18));



        s.merge(input);
    }

    @Test
    void merge2() {
        Solution s= new Solution();
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(2,3));
        input.add(new Interval(5,5));
        input.add(new Interval(2,2));
        input.add(new Interval(3,4));
        input.add(new Interval(3,4));



        s.merge(input);
    }


    @Test
    void mergeLCSolutionTest() {
        LCSolution s= new LCSolution();
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(2,3));
        input.add(new Interval(5,5));
        input.add(new Interval(2,2));
        input.add(new Interval(3,4));
        input.add(new Interval(3,4));



        s.merge(input);
    }

}