class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int target = 0;
        
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int j= i+1;
            int k = nums.length-1;        
            while(j<k)
            {
              

                if(nums[i]+nums[j]+nums[k] < target) 
                {
                    j++;   
                }   
                else if(nums[i]+nums[j]+nums[k] > target)
                {
                    k--;        
                }
                else 
                {
                    List<Integer> currRes = new ArrayList<>();
                    currRes.add(nums[i]);
                    currRes.add(nums[j]);
                    currRes.add(nums[k]);    
                    
                    result.add(currRes);
                    
                    int currK = nums[k];
                    while(nums[k] ==currK && j<k) k--;
                    int currJ = nums[j];
                    while(nums[j] == currJ && j<k) j++;
                }
            }
        }
        
        return result;
    }
}