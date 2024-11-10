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
    
    public void util(TreeNode root,List<Integer> result)
    {
        if(root==null) return;
        util(root.left,result);
        util(root.right,result);
        result.add(root.val);

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        util(root,result);
        return result;

    }
}