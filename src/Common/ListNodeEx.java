package Common;

public class ListNodeEx{
    public static ListNode buildLinkedList(int[] nums){
        ListNode head = new ListNode(-1);
        ListNode p = head;

        for(int i=0;i< nums.length;i++){
            p.next= new ListNode(nums[i]);
            p= p.next;
        };

        return head.next;
    }
}