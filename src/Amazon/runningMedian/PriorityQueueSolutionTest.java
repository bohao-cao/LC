package Amazon.runningMedian;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueSolutionTest {

    @Test
    void studyPR() {
        PriorityQueueSolution s= new PriorityQueueSolution();
        List<Double> res = s.studyPR(new double[]{3,1,4,2,6,7,0}, false);

        List<Double> res2 = s.studyPR(new double[]{3,1,4,2,6,7,0}, true);
    }
}