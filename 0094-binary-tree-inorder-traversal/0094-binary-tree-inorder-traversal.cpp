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
    vector<int> inorderTraversal(TreeNode* root) {
        
        vector<int> left;
        vector<int> right;
        if(!root) return left;

        if(root->left) 
            left = inorderTraversal(root->left);
        left.push_back(root->val);
        if(root->right)
            right = inorderTraversal(root->right);
        left.insert(left.end(),right.begin(),right.end());
        return left;
            
    }
};