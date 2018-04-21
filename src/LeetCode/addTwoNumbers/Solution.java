package LeetCode.addTwoNumbers;
import Common.ListNode;

//You are given two non-empty linked lists representing two non-negative integers.
//The digits are stored in reverse order and each of their nodes contain a single digit.
//Add the two numbers and return it as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//        Example
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p = ret;
        int carry = 0;

        while(p1 != null && p2 != null){
            int number = (p1.val + p2.val + carry)%10;
            carry = (p1.val + p2.val + carry)/10;

            p.next = new ListNode(number);
            p = p.next;

            p1 = p1.next;
            p2 = p2.next;
        }

        ListNode t = p1 == null ? p2 : p1;

        while(t!= null){
            int number = (t.val + carry)%10;
            carry = (t.val + carry)/10;

            p.next = new ListNode(number);

            t=t.next;
            p = p.next;
        }

        if(carry != 0)
            p.next = new ListNode(carry);

        return ret.next;

    }
}
