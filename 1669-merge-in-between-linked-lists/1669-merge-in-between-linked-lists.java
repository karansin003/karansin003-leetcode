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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode s1 = list1;
        ListNode e1 = list1;
        ListNode e2 = list2;
        for(int i = 0; i <= b; i++)
        {
            if(i < a - 1)
            {
                s1 = s1.next;
            }
                e1 = e1.next;
        }
        s1.next = list2;
        while(e2.next != null )
        {
            e2 = e2.next;
        }
        e2.next = e1;
        return list1;
    }
}