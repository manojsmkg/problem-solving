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
    public ListNode reverse(ListNode head)
    {
        if(head==null) return head;
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null)
        {
            ListNode loop_temp = temp.next;
            temp.next=prev;
            prev=temp;
            temp=loop_temp;
        }
        
        temp=prev;
          while(temp!=null)
        {
         System.out.println(temp.val);
            temp=temp.next;
        }        
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead = null;
        ListNode temp=head;
        int kTemp=k-1;
        k--;
        ListNode prev_end = null;
        
        
        while(temp!=null)
        {   ListNode currHead = temp;
             while(k>0&temp.next!=null) {temp=temp.next;k--;}
         if(k==0) {
             k=kTemp;
             ListNode  loop_temp = temp.next;
             temp.next = null;
             ListNode newRevHead = reverse(currHead);
         if(newHead == null) newHead = newRevHead;
         else prev_end.next = newRevHead;
         prev_end = currHead;
         temp=loop_temp;}
         else {prev_end.next=currHead;break;}
        }
        
        
        return newHead;
    }
}