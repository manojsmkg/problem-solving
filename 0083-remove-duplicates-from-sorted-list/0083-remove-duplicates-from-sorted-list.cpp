/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        
        if(!head) return head;
        
        ListNode* temp = head;
        ListNode* prev = NULL;
        int start=0;
        while(temp)
        {
            if(!prev) 
            {
                prev=temp;
                temp=temp->next;
                continue;
            }
            else if( prev && prev->val == temp->val)
            {
                temp=temp->next;
                prev->next=temp;
                continue;
            }
            else
            {
                prev=temp;
                temp=temp->next;
                
            }
        }
        
        return head;
    }
};