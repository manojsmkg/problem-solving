class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int gmax = 1;
        int lmax = 1;

        for(int i=1;i<n;i++)
        {
            if(nums[i]-nums[i-1] == 1)
            {
                lmax++;
                gmax = Math.max(gmax,lmax);
            }
            else if(nums[i]==nums[i-1]) continue;

            else
                lmax = 1;
        }
        return gmax;
        
    }
}