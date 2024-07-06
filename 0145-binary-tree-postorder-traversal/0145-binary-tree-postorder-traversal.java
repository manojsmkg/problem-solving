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
    
    public List<Integer> postOrderUtil(TreeNode root,List<Integer> listSoFar)
    {
        if(root==null) return listSoFar;
        listSoFar = postOrderUtil(root.left,listSoFar);
        listSoFar = postOrderUtil(root.right,listSoFar);
        listSoFar.add(root.val);
        return listSoFar;
        
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        if(root==null) return postOrder;
        return postOrderUtil(root,postOrder);       
    }
}