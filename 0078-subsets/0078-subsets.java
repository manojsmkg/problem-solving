class Solution {
    public void subsetsBackTrack(int[] nums,int ind,int n,List<Integer> currList,List<List<Integer>> res)
    {
        if(ind==n)
        {
            res.add(new ArrayList<>(currList));
            return;
        }
        currList.add(nums[ind]);
        subsetsBackTrack(nums,ind+1,n,currList,res);
        currList.remove(currList.size()-1);
        subsetsBackTrack(nums,ind+1,n,currList,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null) return res;
        
        subsetsBackTrack(nums,0,nums.length,new ArrayList<>(),res);
        return res;
    }
}