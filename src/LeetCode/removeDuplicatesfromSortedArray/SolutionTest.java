package LeetCode.removeDuplicatesfromSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeDuplicates() {
        Solution s= new Solution();
        int r = s.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});

    }

    @Test
    void removeDuplicates2() {
        Solution s= new Solution();
        int r = s.removeDuplicates(new int[]{1,1,2});

    }
}