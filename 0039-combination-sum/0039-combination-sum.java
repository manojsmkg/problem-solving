class Solution {
    
    public void combinationUtil(int sum,int target,int i,List<List<Integer>> res,List<Integer> currList,int[] candidates,int n)
    {
        if(i==n) 
        {
            if(target == 0)  { res.add(currList);}
            return;
        }
        
        if(target<0) return;
        
        
            if(candidates[i]<=target)
            {
            currList.add(candidates[i]);
            combinationUtil(sum+candidates[i],target-candidates[i],i,res,new ArrayList<>(currList),candidates,n);
            currList.remove(currList.size()-1);
            }
        
        combinationUtil(sum,target,i+1,res,currList,candidates,n);
        
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> result = new ArrayList<>();
        combinationUtil(0,target,0,result,new ArrayList<>(),candidates,candidates.length);
        return result;
    }
}