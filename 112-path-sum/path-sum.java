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
    public boolean hasPathSumUtil(TreeNode root, int targetSum, int currSum)
    {
        if(root==null) return false;
        currSum += root.val;
        if(root.left==null && root.right==null && currSum == targetSum) return true;
        else return hasPathSumUtil(root.left,targetSum,currSum) || hasPathSumUtil(root.right,targetSum,currSum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) 
    {

        return hasPathSumUtil(root,targetSum,0);
    }
}