package LeetCode.palindromeLinkedList;

import Common.ListNode;
import Common.ListNodeEx;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void isPalindromeEven() {

            ListNode head = ListNodeEx.buildLinkedList(new int[]{1,2,3,3,2,1});
            Solution s = new Solution();
            assertTrue(s.isPalindrome(head));

    }

    @Test
    void isPalindromeOdd() {

        ListNode head = ListNodeEx.buildLinkedList(new int[]{1,2,3,2,1});
        Solution s = new Solution();
        assertTrue(s.isPalindrome(head));

    }

    @Test
    void isPalindromeNegative() {

        ListNode head = ListNodeEx.buildLinkedList(new int[]{2,1,3,2,1});
        Solution s = new Solution();
        assertFalse(s.isPalindrome(head));

    }

    @Test
    void isPalindromeNegative2() {

        ListNode head = ListNodeEx.buildLinkedList(new int[]{2,1,3,3,2,1});
        Solution s = new Solution();
        assertFalse(s.isPalindrome(head));

    }

    @Test
    void isPalindromeNegative3() {

        ListNode head = ListNodeEx.buildLinkedList(new int[]{2,2,3,4,2,1});
        Solution s = new Solution();
        assertFalse(s.isPalindrome(head));

    }

}