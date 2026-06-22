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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode t1 = head;
        while (t1 != null) {
            ListNode t2 = t1.next;
            int nextGreater = 0;
            while (t2 != null) {
                if (t2.val > t1.val) {
                    nextGreater = t2.val;
                    break;
                }
                t2 = t2.next;
            }
            list.add(nextGreater);
            t1 = t1.next;
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}