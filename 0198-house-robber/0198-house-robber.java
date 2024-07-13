class Solution {
    public int rob(int[] nums) {
        int houses=nums.length;
        int dp[] = new int[houses+1];
        if(houses==1) return nums[0];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        if(houses==2) return dp[1];
    
        for(int i=2;i<houses;i++)
        {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[houses-1];
        
    }
}