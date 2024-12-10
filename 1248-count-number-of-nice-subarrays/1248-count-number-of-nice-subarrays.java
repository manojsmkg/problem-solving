class Solution {
    public int numSubArraysUtil(int[] nums,int k,int n)
    {
        int start = 0;
        int end = 0;
        int ct = 0;
        int currK = 0;
        while(end<n)
        {
            if(currK<=k && nums[end]%2 == 1) 
                currK++;

            while(currK>k)
            {
                if(nums[start]%2==1) currK--;
                start++;
            }
             ct+=(end-start+1);
            end++;
        }
        return ct;
    }
    public int numberOfSubarrays(int[] nums, int k) 
    {
      int n = nums.length;
      return numSubArraysUtil(nums,k,n) - numSubArraysUtil(nums,k-1,n);
        
    }
}