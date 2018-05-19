package Amazon.runningMedian;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void runningMedian() {

        //RecurseSolution s = new RecurseSolution();
        PriorityQueueSolution s = new PriorityQueueSolution();
        int[] input = new int[]{12, 4, 5, 3, 8, 7};
        double[] exp = new double[]{12.0, 8.0, 5.0, 4.5, 5.0, 6.0};
        double[] x = s.runningMedian(input);
        assertTrue(Arrays.equals(exp, x));
    }
    @Test
    void runningMedian2() {

        //RecurseSolution s = new RecurseSolution();
        PriorityQueueSolution s = new PriorityQueueSolution();
        int[] input = new int[]{1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10};
        double[] exp = new double[]{1.0,
                1.5,
                2.0,
                2.5,
                3.0,
                3.5,
                4.0,
                4.5,
                5.0,
                5.5};
        double[] x = s.runningMedian(input);
        assertTrue(Arrays.equals(exp, x));
    }


}