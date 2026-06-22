class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
        return head;
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode pre = newhead;
        ListNode curr = head;
        while(curr != null)
        {
            if(curr.next != null && curr.val == curr.next.val)
            {
                while(curr.next != null && curr.val == curr.next.val)
                {
                    curr = curr.next;
                }
                pre.next = curr.next;
            }
            else
            {
                pre = pre.next;
            }
            curr = curr.next;
        }
    return newhead.next;
    }
}