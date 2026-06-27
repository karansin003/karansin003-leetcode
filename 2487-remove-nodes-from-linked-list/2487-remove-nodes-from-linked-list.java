class Solution {
    private ListNode reverse(ListNode head)
    {
        ListNode pre = null;
        ListNode curr = head;
        while( curr != null)
        {
            ListNode post = curr.next;
            curr.next = pre;
            pre = curr;
            curr = post;
        }
        return pre;
    }
    public ListNode removeNodes(ListNode head) {
         if (head == null) {
            return null;
        }
       head = reverse(head);
       ListNode temp = head;
       int max = head.val;
       while(temp.next != null)
       {
            if(temp.next.val < temp.val)
            {
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
                max = temp.val;
            }
       }
       return reverse(head);
    }
}