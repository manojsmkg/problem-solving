class Solution {
     public int numSubArraysUtil(int[] nums,int k,int n)
    {
        int start = 0;
        int end = 0;
        int ct = 0;
        int currSum = 0;
        while(end<n)
        {
            currSum+=nums[end];

            while(currSum>k && start<=end)
            {
                currSum-=nums[start];
                start++;
            }
             ct+=(end-start+1);
            end++;
        }
        return ct;
    }
    
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubArraysUtil(nums,goal,nums.length) - numSubArraysUtil(nums,goal-1,nums.length);
    }
}