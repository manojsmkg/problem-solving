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
    
        public List<Integer> inOrderUtil(TreeNode root,List<Integer> listSoFar)
    {
        if(root==null) return listSoFar;
        listSoFar = inOrderUtil(root.left,listSoFar);
        listSoFar.add(root.val);
        listSoFar = inOrderUtil(root.right,listSoFar);
        return listSoFar;
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> inOrder = new ArrayList<>();
        if(root==null) return inOrder;
        return inOrderUtil(root,inOrder);
    }
}