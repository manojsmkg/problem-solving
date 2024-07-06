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
    
    public List<Integer> preOrderUtil(TreeNode root,List<Integer> listSoFar)
    {
        if(root==null) return listSoFar;
        listSoFar.add(root.val);
        listSoFar = preOrderUtil(root.left,listSoFar);
        listSoFar = preOrderUtil(root.right,listSoFar);
        return listSoFar;
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<>();
        if(root==null) return preOrder;
        return preOrderUtil(root,preOrder);
    }
}