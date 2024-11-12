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
    public TreeNode searchBSTUtil(TreeNode root, int val)
    {
        if(root == null) return root;
        else if(root.val == val) return root;
        else if (root.val<val) return searchBSTUtil(root.right,val);
        else return searchBSTUtil(root.left,val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return searchBSTUtil(root,val);
        
    }
}