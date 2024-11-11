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
    
    int diameter = 0;
    
    public int util(TreeNode root, int height)
    {
        if(root==null) return height;
        int lh=0,rh=0;
        lh = util(root.left,height);
        rh = util(root.right,height);
        
        diameter = Math.max(lh+rh,diameter);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root==null) return 0;
        int h = util(root,0);
        return diameter;
    }
}