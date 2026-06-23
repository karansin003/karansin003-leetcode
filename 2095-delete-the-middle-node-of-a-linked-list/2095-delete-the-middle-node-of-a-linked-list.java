class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        if(head==null||head.next==null){
            return null;
        }
        if(head.next.next == null){
            head.next = null;
            return head;
        }
        while(fast!= null&& fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
}