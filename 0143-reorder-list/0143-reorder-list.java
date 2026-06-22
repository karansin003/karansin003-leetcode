/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        while (curr != null) {
            ListNode post = curr.next;
            curr.next = pre;
            pre = curr;
            curr = post;
        }
        return pre;
    }

    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newhead = slow.next;
        slow.next = null;
        newhead = reverse(newhead);
        ListNode t1 = head;
        ListNode t2 = newhead;
        while (t2 != null) {
            ListNode tmp1 = t1.next;
            ListNode tmp2 = t2.next;

            t1.next = t2;
            t2.next = tmp1;

            t1 = tmp1;
            t2 = tmp2;
        }
    }
}