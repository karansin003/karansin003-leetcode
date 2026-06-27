class Solution {
    public ListNode partition(ListNode head, int x) {
      ListNode smallDemo = new ListNode(0);
      ListNode largeDemo = new ListNode(0);
      ListNode small = smallDemo;
      ListNode large = largeDemo;
      ListNode temp = head;
      while(temp != null)  
      {
        if(temp.val < x)
        {
            small.next = temp;
            small = small.next;
        }
        else
        {
            large.next = temp;
            large = large.next;
        }
        temp = temp.next;
      }
      large.next = null;
      small.next = largeDemo.next;
      return smallDemo.next;
    }
}