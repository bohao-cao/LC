package LeetCode.palindromeLinkedList;

import Common.ListNode;


/*        Given a singly linked list, determine if it is a palindrome.
        Follow up:
        Could you do it in O(n) time and O(1) space?*/
public class Solution {
    public boolean isPalindrome(ListNode head) {
        int middle = 0, count = 0;
        ListNode p = head;
        while(p!= null){
            count++;
            p=p.next;
        }
        middle = count/2+count%2;

        int c =middle;
        p =head;
        ListNode prev = null;

        while(c-->0){
            ListNode t =  p.next;
            p.next = prev;
            prev = p;
            p = t;
        }
        if(count%2==1)
            prev = prev.next;
        //p moves backward, t moves forward
        while(p!=null && prev != null){
            if(p.val != prev.val)
                return false;
            p=p.next;
            prev=prev.next;
        }

        return true;
    }

}
