package LeetCode.linkedListCycleII;

import Common.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        ListNode hare = head;
        ListNode turtle = head;

        while(true){
            if(hare.next == null || hare.next.next == null)
                return null;
            hare = hare.next.next;
            turtle = turtle.next;
            if(turtle == hare)
                break;

        }

        ListNode p1 = turtle;
        ListNode p2 = head;

        while(p1 != p2)
        {
            p1=p1.next;
            p2=p2.next;
        }
        return p1;

    }
}
