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
    public ListNode removeElements(ListNode head, int val) 
    {
        if(head == null) return head;
        ListNode prev = null;
        while(head!=null && head.val == val) {head = head.next;}
        ListNode tempHead = head;
        while(tempHead!=null && tempHead.next!=null)
        {
            ListNode currNode = tempHead.next;
            while(currNode!=null && currNode.val==val)
               currNode = currNode.next;
            tempHead.next = currNode;
            tempHead = tempHead.next;
        }
        System.gc();
        return head;
    }
}