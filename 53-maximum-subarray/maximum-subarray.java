class Solution {
    public int maxSubArray(int[] nums) 
    {
        int lmax = nums[0];
        int gmax = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++)
        {
            lmax = Math.max(lmax+nums[i],nums[i]);
            gmax = Math.max(lmax,gmax);
        }
        return gmax;        
    }
}