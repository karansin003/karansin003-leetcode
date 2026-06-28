class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode demo = new ListNode(0);
        ListNode t = demo;
        ListNode temp = head.next;
        int sum = 0;
        while(temp != null)
        {
            if(0 == temp.val)
            {
                ListNode tm = new ListNode(sum);
                t.next = tm;
                t = t.next;
                sum = 0 ;
            }
            sum += temp.val;
            temp = temp.next;
        }
        return demo.next;
    }
}