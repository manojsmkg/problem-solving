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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        
        if(!list1) return list2;
        if(!list2) return list1;
        
        ListNode* temp1 = list1;
        ListNode* temp2 = list2;
        ListNode* result;
        ListNode* resultHead;
        
        while(temp1 && temp2)
        {
           
            if(temp1->val <= temp2->val) 
            {
                if(result) 
                {
                    result->next = temp1;
                    result = result->next;
                }
                
                else 
                {   result=temp1;
                    resultHead = result;  
                }
                temp1 = temp1->next;
                continue;
            }
            else
            {
                if(result) 
                {
                   result->next = temp2;
                    result = result->next;
                }
                
                else 
                {
                   
                     result=temp2;
                    resultHead = result;
                }
                temp2 = temp2->next;
                continue;
            }
        }
        
       while(temp1)
        {
            result->next = temp1;
           temp1 = temp1->next;
           result = result->next;
        }
        while(temp2)
        {
            result->next = temp2;
            temp2 = temp2->next;
            result=result->next;
        }
        result->next = NULL;
        return resultHead;
    }
};