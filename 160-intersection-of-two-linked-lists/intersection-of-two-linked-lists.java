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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        int l1=0,l2=0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA!=null)
        {
            l1++;
            tempA = tempA.next;
        }
        while(tempB!=null)
        {
            l2++;
            tempB = tempB.next;
        }

        int ct = Math.abs(l2-l1);
        tempB= headB;
        tempA= headA;
        if(l2>l1)
        {
            while(ct>0)
            {   
                tempB = tempB.next;
                ct--;
            }
        }
        else
        {
            while(ct>0)
            {   
                tempA = tempA.next;
                ct--;
            }
        }

        while(tempA!=null && tempB!=null && tempA!=tempB)
        {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        if(tempA==tempB) return tempA;

    //    System.out.println(tempA.val);
      //  if(tempA!=null && tempB!=null && tempA==tempB) return tempA;
        return null;
    }
}