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
    int globalDiameter = 0;
    public int diaMeterOfBinaryTreeUtil(TreeNode root,int currHeight)
    {
        if(root==null) return currHeight;
        
        int lh=diaMeterOfBinaryTreeUtil(root.left,currHeight);
        int rh=diaMeterOfBinaryTreeUtil(root.right,currHeight);
        int currDiameter = lh+rh;
        globalDiameter = Math.max(currDiameter,globalDiameter);
        return Math.max(lh,rh)+1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
             int h = diaMeterOfBinaryTreeUtil(root,0);
        return globalDiameter;
    }
}