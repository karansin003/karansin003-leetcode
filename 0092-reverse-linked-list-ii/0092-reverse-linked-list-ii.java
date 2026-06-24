class Solution {
    private ListNode reverse(ListNode NewHead,int lim)
    {
        ListNode curr = NewHead;
        ListNode pre = null;
        int x = 0;
        while(curr != null && x < lim)
        {
            ListNode post = curr.next;
            curr.next = pre;
            pre = curr;
            curr = post;
            x++;
        }
        return pre;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
       ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode l = dummy;

        for (int i = 1; i < left; i++) {
            l = l.next;
        }

        ListNode r = l;
        for (int i = left; i <= right; i++) {
            r = r.next;
        }
        ListNode rev = l.next;
        ListNode r_store = r.next;
        ListNode l_store = l.next;
        l.next = reverse(rev,right - left + 1);
        l_store.next = r_store;
        return dummy.next;
    }
}