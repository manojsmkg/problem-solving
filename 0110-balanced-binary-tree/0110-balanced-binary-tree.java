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
    public int isBalancedUtil(TreeNode root)
    {
        if(root==null) return 0;
        
        int lh = isBalancedUtil(root.left);
        int rh = isBalancedUtil(root.right);
        
        if(Math.abs(lh-rh)>1) return Integer.MAX_VALUE;
        
        if(lh == Integer.MAX_VALUE || rh == Integer.MAX_VALUE) return Integer.MAX_VALUE;
        
        return Math.max(lh,rh)+1;
    }
    public boolean isBalanced(TreeNode root) 
    {
        if(root==null) return true;
        int lh = isBalancedUtil(root);

      //  int lh = isBalancedUtil(root.left);
      //  int rh = isBalancedUtil(root.right);
      //  return Math.abs(lh-rh)<=1;
        return !(lh == Integer.MAX_VALUE);
    }
}