/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    
    public void getAllChilds(TreeNode root,int k,List<Integer> childList,Map<TreeNode,TreeNode> parentMap,Map<TreeNode,Integer> visitedMap)
    {
        if(root == null) return;
        if(visitedMap.containsKey(root)) return;
        if(k<0) return;
        if(k==0) childList.add(root.val);
        visitedMap.put(root,1);
        getAllChilds(root.left,k-1,childList,parentMap,visitedMap);
        getAllChilds(root.right,k-1,childList,parentMap,visitedMap);
        getAllChilds(parentMap.get(root),k-1,childList,parentMap,visitedMap);
    
    }
    
    public void buildParentMap(TreeNode root,Map<TreeNode,TreeNode> treeMap,TreeNode target)
    {
        if(root==null) return;
        if(root.left!=null) 
        {
            treeMap.put(root.left,root);
        //    System.out.println(root.left.val + " " + root.val);
            buildParentMap(root.left,treeMap,target);
        }
        if(root.right!=null)
        {
            treeMap.put(root.right,root);
        //    System.out.println(root.right.val + " " + root.val);
            buildParentMap(root.right,treeMap,target);
        }
       // if(root.left == target || root.right == target) return;
    }
  
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) 
    {
        List<Integer> result = new ArrayList<>();
        Map<TreeNode,Integer> visitedMap = new HashMap<>();
        Map<TreeNode,TreeNode> treeMap = new HashMap<>();
        
        buildParentMap(root,treeMap,target);
        getAllChilds(target,k,result,treeMap,visitedMap);
       // addChildsFromParent(treeMap,k-1,treeMap.get(target),result);
        return result;
    }
}