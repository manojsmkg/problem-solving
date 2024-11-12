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
    
    public TreeNode buildTreeUtil(int[] preorder, int[] inorder,int iS, int iE,int pS,int pE,Map<Integer, Integer> inMap)
    {
        if(iS > iE || pS > pE) return null;
        TreeNode root = new TreeNode(preorder[pS]);
        int count = inMap.get(preorder[pS]) - iS;
        root.left = buildTreeUtil(preorder,inorder,iS,inMap.get(preorder[pS])-1,pS+1,pS+count,inMap);
        root.right = buildTreeUtil(preorder,inorder,inMap.get(preorder[pS])+1,iE,pS+count+1,pE,inMap);
        return root;
        
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        if(preorder.length!=inorder.length) return null;
        if(preorder.length == 0) return null;
        
        Map<Integer,Integer> inMap = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            inMap.put(inorder[i],i);
        }
        
        return buildTreeUtil(preorder,inorder,0,inorder.length-1,0,preorder.length-1,inMap);
    }
}