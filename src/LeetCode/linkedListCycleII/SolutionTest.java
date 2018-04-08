package LeetCode.linkedListCycleII;

import Common.ListNode;
import Common.ListNodeEx;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void detectCycle() {
        int[] input = new int[]{3,2,0,-4};

        ListNode p = new ListNode(3);
        p.next = new ListNode(2);
        p.next.next = new ListNode(0);
        p.next.next.next = new ListNode(-4);
        p.next.next.next.next = p.next;

        Solution s= new Solution();
        s.detectCycle(p);



    }

}