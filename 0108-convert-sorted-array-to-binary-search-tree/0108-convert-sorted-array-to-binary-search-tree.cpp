/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    
    TreeNode* sortedArrayToBSTUtil(vector<int>& nums,int left,int right)
    {
        if(left>right) return NULL;
        int mid = left + (right-left)/2;
        TreeNode* currNode = new TreeNode(nums[mid]);
        currNode->left = sortedArrayToBSTUtil(nums,left,mid-1);
        currNode->right = sortedArrayToBSTUtil(nums,mid+1,right);
        
        return currNode;
    }
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        if(nums.size() == 0) return NULL;
        return sortedArrayToBSTUtil(nums,0,nums.size()-1);
        
        
    }
};