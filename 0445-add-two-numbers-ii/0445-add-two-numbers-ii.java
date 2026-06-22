//  good question carry 0  tb hoga jb loop ke last me dono pointers age nhi bdhege or carry 1 rhega 
class Solution {
    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode post = head.next;
            head.next = pre;
            pre = head;
            head = post;
        }
        return pre;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        ListNode L1 = reverse(l1);
        ListNode L2 = reverse(l2);
        while (L1 != null || L2 != null || carry != 0) {
            int sum = carry;
            if (L1 != null) {
                sum += L1.val;
                L1 = L1.next;
            }
            if (L2 != null) {
                sum += L2.val;
                L2 = L2.next;
            }

            int digit = sum % 10;
            carry = sum / 10;
            ListNode newnode = new ListNode(digit);
            if (head == null) {
                head = newnode;
                tail = newnode;
            } else {
                tail.next = newnode;
                tail = newnode;
            }
        }
        head = reverse(head);
        return head;
    }
}