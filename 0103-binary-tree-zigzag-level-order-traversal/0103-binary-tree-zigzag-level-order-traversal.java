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
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean rL = false;
        
        while(q.isEmpty()!=true)
        {
            int k=q.size();
            List<Integer> currRes = new ArrayList<>();
            while(k>0)
            {
                TreeNode currNode = q.poll();
                //if(rL)
              //  {
                    if(currNode.left != null) q.add(currNode.left);
                    if(currNode.right != null) q.add(currNode.right);
                //}
               /* else
                {
                    if(currNode.right != null) q.add(currNode.right);
                    if(currNode.left != null) q.add(currNode.left);
                }*/
                k--;
                currRes.add(currNode.val);
            }
            
           if(rL) Collections.reverse(currRes);
            result.add(currRes);
            rL=!rL;
            
        }
        return result;
        
    }
}