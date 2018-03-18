package LeetCode.reverseLinkedList;
import Common.*;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode prev = null;
        while(p!= null){
            ListNode t = p.next;
            p.next = prev;
            prev = p;
            p = t;
        }
        Integer.M
        return prev;
    }
}
