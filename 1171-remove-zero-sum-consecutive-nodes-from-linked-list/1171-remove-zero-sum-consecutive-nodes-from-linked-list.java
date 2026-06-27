class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode demo = new ListNode(0);
        demo.next = head;
        ListNode temp = demo;
        HashMap<Integer,ListNode> map = new HashMap<>();
        int sum = 0;
        while(temp != null)
        {
            sum += temp.val;
            map.put(sum,temp);
            temp = temp.next;
        }
        sum = 0;
        temp = demo;
        while(temp != null)
        {
            sum += temp.val;
            temp.next = map.get(sum).next;
            temp = temp.next;
        }
        return demo.next;
    }
}