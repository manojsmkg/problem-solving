/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Boolean sol = false;
    int currK=0;
    public int kthSmallestUtil(TreeNode root,int k)
    {
        if(root==null) return -1;
        int result = kthSmallestUtil(root.left,k);
        if(sol==true) return result;
        currK++;
        if(currK==k) {sol=true;return root.val;}
        result = kthSmallestUtil(root.right,k);
        if(sol==true) return result;
        return -1;
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        return kthSmallestUtil(root,k);
        
    }
}