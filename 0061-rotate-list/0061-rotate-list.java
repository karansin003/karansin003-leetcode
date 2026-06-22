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
    public ListNode rotateRight(ListNode head, int k) {
        // if(size % 2 != 0 && k == 5)
        //     return head;
        // if(size % 2 == 0 && k == 4)
        //     return head;
        if (head == null || head.next == null || k == 0)
            return head;
       
         ListNode t = head;
        int size = 0;
        while(t!= null)
        {
            size++;
            t =t.next;
        }
        k = k % size;
        for (int i = 0; i < k; i++) {
        ListNode slow = null;
        ListNode fast = head;
            while (fast.next != null) {
                slow = fast;
                fast = fast.next;
            }
            slow.next = null;
            fast.next = head;
            head = fast;
        }
        return head;
    }
}