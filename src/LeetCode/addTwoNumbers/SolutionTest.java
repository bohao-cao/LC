package LeetCode.addTwoNumbers;

import Common.ListNode;

class SolutionTest {
    @org.junit.jupiter.api.Test
    void test1() {
        int[] x1 = new int[]{2,4,3};
        int[] x2 = new int[]{5,6,4};

        ListNode l1 = createListNode(x1);
        ListNode l2 = createListNode(x2);

        Solution s = new Solution();
        ListNode ret = s.addTwoNumbers(l1, l2);

    }

    private ListNode createListNode(int[] l1) {
        ListNode x = new ListNode(0);
        ListNode p = x;
        for (int n: l1) {
            p.next = new ListNode(n);
            p = p.next;
        }
        return x.next;
    }


}