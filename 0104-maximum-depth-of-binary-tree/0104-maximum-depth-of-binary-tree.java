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
    public int maxDepthUtil(TreeNode root, int height)
    {
        int lh = height,rh = height;
        if(root.left!=null) lh = maxDepthUtil(root.left,lh+1);
        if(root.right!=null) rh = maxDepthUtil(root.right,rh+1);
        return Math.max(lh,rh);
    }
    public int maxDepth(TreeNode root) 
    {
        if(root==null) return 0;
        return maxDepthUtil(root,1);
    }
}