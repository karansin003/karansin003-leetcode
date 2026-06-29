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
    private int gcb(int a , int b)
    {
        while(b != 0)
        {
            int rem =  a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next != null)
        {
            ListNode post = temp.next;
            int value = gcb(temp.val,post.val);
            ListNode curr = new ListNode(value);
            temp.next = curr;
            curr.next = post;
            temp = post;
        }
        return head;
    }
}