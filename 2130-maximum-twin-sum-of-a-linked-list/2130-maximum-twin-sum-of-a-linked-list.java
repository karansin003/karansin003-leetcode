class Solution {
        //  make duplicate list reverse 
     ListNode reverse(ListNode head)
     {
        ListNode pre = null;
        while(head != null)
        {   ListNode post = head.next;
            head.next = pre;
            pre = head;
            head = post;
        }
        return pre;
     } 
    public int pairSum(ListNode head) {
        if (head == null || head.next == null) return -1;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode midnext = reverse(slow.next);
        // slow.next = midnext;
        ListNode t1 = head;
        ListNode t2 = midnext;
        int sum = 0;
        while(t2!= null)
        {
            sum = Math.max(sum,(t1.val+t2.val));
            t1 = t1.next;
            t2 = t2.next;
        }
        return sum;
    }
}