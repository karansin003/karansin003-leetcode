class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        ListNode demo = new ListNode(0);
        demo.next = head;
        ListNode temp = demo;
        while(temp.next != null)
        {
            if(set.contains(temp.next.val))
            {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return demo.next;
    }
}