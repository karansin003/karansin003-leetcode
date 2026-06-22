class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null,tail = null;
        int carry = 0;
        while(l1!= null || l2 != null || carry != 0)
        {
            int sum = carry;
            if(l1 != null )
            {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null )
            {
                sum += l2.val;
                l2 = l2.next;
            }

            int digit = sum % 10;
            carry = sum /10;
            ListNode newnode = new ListNode(digit);
            if( head == null)
            {
                head = newnode;
                tail = newnode;
            }
            else
            {
                tail.next = newnode;
                tail = newnode;
            }
        }
        return head;
    }
}