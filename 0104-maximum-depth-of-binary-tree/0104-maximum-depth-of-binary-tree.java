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
    
    public int maxDepthUtil(TreeNode root,int currDepth)
    {
        if(root==null) return currDepth;
        
        int leftMax = maxDepthUtil(root.left,currDepth+1);
        int rightMax = maxDepthUtil(root.right,currDepth+1);
        
        return leftMax>rightMax?leftMax:rightMax;        
    }
    public int maxDepth(TreeNode root) 
    {
        if(root==null) return 0;
        
        int leftMax = maxDepthUtil(root.left,0);
        int rightMax = maxDepthUtil(root.right,0);
        
        return leftMax>rightMax?leftMax+1:rightMax+1;        
    }
}