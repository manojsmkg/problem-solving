/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    
    public TreeNode util(TreeNode root,TreeNode p, TreeNode q)
    {
        if(root==null) return root;
        
        if(root == p || root == q) return root;
        
        TreeNode left = util(root.left,p,q);
        TreeNode right = util(root.right,p,q);
        
        if(left == null) return right;
        if(right == null) return left;
        
        return root;
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        return util(root,p,q);
    }
}