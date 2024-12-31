class Solution {
    
    public void generateSubArr(int[] nums,int i,int n,List<Integer> res,List<List<Integer>> finalResult)
    {
        if(i>=n) 
        {
            finalResult.add(new ArrayList(res));
            return;
        }
        res.add(nums[i]);
        generateSubArr(nums,i+1,n,res,finalResult);
        res.remove(res.size()-1);
        generateSubArr(nums,i+1,n,res,finalResult);
    }
    
    public List<List<Integer>> subsets(int[] nums) 
    {
        if(nums==null) return null;

        List<List<Integer>> finalResult = new ArrayList<>();
        if(nums.length==0) return finalResult;
        generateSubArr(nums,0,nums.length,new ArrayList<>(),finalResult);

        return finalResult;
    }
}