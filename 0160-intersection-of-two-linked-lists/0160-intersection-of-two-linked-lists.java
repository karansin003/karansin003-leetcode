/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA==null || headB==null)
         {
            return null;
         }
    int sizeA = 0;
    int sizeB = 0;
  ListNode tempB = headB;
    ListNode tempA = headA;
    while(tempA != null) 
    {
        tempA = tempA.next;
        sizeA++;
    }
    while(tempB != null) 
    {
        tempB = tempB.next;
        sizeB++;
    }
    tempB = headB;
    tempA = headA;
    if(sizeA > sizeB)
    {
       
        for(int i = 0; i < (sizeA-sizeB);i++)
        {
            tempA = tempA.next;
        }
 

    }
    else 
    {
        for(int i = 0; i < (sizeB - sizeA);i++)
        {
            tempB = tempB.next;
        }
        
    }
    while( tempA != tempB)
        {
    
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}