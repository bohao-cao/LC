package LeetCode.intersectionOfTwoLinkedLists;


import Common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Write a program to find the node at which the intersection of two singly linked lists begins.


        For example, the following two linked lists:

        A:          a1 → a2
                            ↘
                             c1 → c2 → c3
                            ↗
        B:     b1 → b2 → b3
        begin to intersect at node c1.


        Notes:

        If the two linked lists have no intersection at all, return null.
        The linked lists must retain their original structure after the function returns.
        You may assume there are no cycles anywhere in the entire linked structure.
        Your code should preferably run in O(n) time and use only O(1) memory.*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = new ListNode(-1);
        pa.next = headA;
        ListNode pb = new ListNode(-1);
        pb.next = headB;
        int count = 0;
        while(pa.next!=null&& pb.next!=null){
            pa = pa.next;
            pb = pb.next;
        }
        ListNode shorter = pa.next == null && pb.next!= null ? headA:headB;
        ListNode longer = pa.next==null && pb.next!=null ? headB: headA;
        ListNode l = pa.next == null && pb.next!= null ? pb: pa;
        ListNode s = pa.next == null && pb.next!= null ? pa: pb;

        while(l.next!= null){
            count++;
            l = l.next;
        }
        if(s!=l)
            return null;

        while(count-- >0){
            longer = longer.next;
        }

        while(shorter.val != longer.val){
            shorter = shorter.next;
            longer = longer.next;

        }

        return shorter;
    }

    private String getCompareString(char[] charArray){
        List<Integer> array = new ArrayList(26);
        Collections.fill(array, 0);

        for(char c: charArray){
            int idx = c-'a';
            array.set(idx, array.get(idx)+1);
        }

        StringBuilder ret = new StringBuilder();

        for(int i : array){
            ret.append(i);
        }

        return ret.toString();
    }
}
