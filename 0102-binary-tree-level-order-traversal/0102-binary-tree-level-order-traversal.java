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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
      Queue<TreeNode> lot = new LinkedList<>();
      List<List<Integer>> result = new ArrayList<>();
     if(root==null) return result;
      lot.add(root);
      while(lot.isEmpty() == false)
      {
          int k=lot.size();
          List<Integer> currRes = new ArrayList<>();
          while(k>0)
          {
              TreeNode currNode = lot.poll();
              k--;
              if(currNode == null) continue;
              if(currNode.left!=null) lot.add(currNode.left);
              if(currNode.right!=null) lot.add(currNode.right);
              currRes.add(currNode.val);
          }
          result.add(currRes);
      }
        return result;
    
        
    }
}