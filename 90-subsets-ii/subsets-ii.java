class Solution {

    public void subsetUtil(int[] nums,int n,int ind,List<Integer> currList,Set<List<Integer>> result)
    {
        if(ind == n) {
            result.add(new ArrayList(currList));
            return;
        }
        currList.add(nums[ind]);
        subsetUtil(nums,n,ind+1,currList,result);
     /*   for(int i=ind+1;i<n;i++)
        {
            if(nums[i]==nums[i-1]) continue;
            currList.add(nums[i]);
            subsetUtil(nums,n,i,currList,result);
            currList.remove(currList.size()-1);
        }*/
        currList.remove(currList.size()-1);
        subsetUtil(nums,n,ind+1,currList,result);
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Set<List<Integer>> result = new HashSet<>();
        List<List<Integer>> finalResult  = new ArrayList<>();

        int n = nums.length;
        Arrays.sort(nums);
        subsetUtil(nums,n,0,new ArrayList<>(),result);
        for(List<Integer> res : result)
         finalResult.add(res);
        return finalResult;
    }
}