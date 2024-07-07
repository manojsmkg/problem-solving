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
    public void insertIntoBSTUtil(TreeNode root,int val)
    {
        if(root==null) return;
        else if(val<root.val && root.left!=null) insertIntoBSTUtil(root.left,val);
        else if(val<root.val) {
            TreeNode newNode= new TreeNode(val);
            root.left = newNode;
            return;
        }
        else if(val>=root.val && root.right!=null) insertIntoBSTUtil(root.right,val);
        else {
            TreeNode newNode= new TreeNode(val);
            root.right = newNode;
            return;
        }
        
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
        {
            TreeNode newNode= new TreeNode(val);
            return newNode;
        }
        insertIntoBSTUtil(root,val);
        return root;
        
    }
}