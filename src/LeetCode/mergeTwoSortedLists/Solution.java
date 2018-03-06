package LeetCode.mergeTwoSortedLists;
import Common.ListNode;

/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
https://leetcode.com/problems/merge-two-sorted-lists/description/
*/
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode ret = new ListNode(0);
        ListNode r = ret;

        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                r.next = new ListNode(p1.val);
                p1 = p1.next;
            }
            else{
                r.next = new ListNode(p2.val);
                p2 = p2.next;
            }
            r = r.next;
        }
        ListNode t = p1 == null ? p2 : p1;

        while(t != null){
            r.next = new ListNode(t.val);
            r = r.next;
            t = t.next;
        }

        return ret.next;

    }
}
