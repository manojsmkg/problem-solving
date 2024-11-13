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
    int maxi = Integer.MIN_VALUE;
    
    public int maxPathSumUtil(TreeNode root) 
    {
        if(root == null) return 0;
        int lh = Math.max(0,maxPathSumUtil(root.left));
        int rh = Math.max(0,maxPathSumUtil(root.right));
        maxi = Math.max(lh+rh+root.val,maxi);
        return Math.max(lh,rh)+root.val;
    }
    
    public int maxPathSum(TreeNode root) 
    {
        if(root==null) return 0;
        maxPathSumUtil(root);
        return maxi;
     }
}