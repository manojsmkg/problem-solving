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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head == null) return head;
        ListNode temp = head;
        ListNode currNode = head;
        while(currNode!=null && n>0)
        {
            currNode = currNode.next;
            n--;
        }
        
        ListNode returnHead = temp;
        ListNode prev = null;

        while(currNode!=null)
        {
            prev = temp;
            temp = temp.next;
            currNode = currNode.next;
        }
        if(prev==null)
            returnHead = returnHead.next;

        else  
         prev.next = temp.next;

        return returnHead;     
    }
}