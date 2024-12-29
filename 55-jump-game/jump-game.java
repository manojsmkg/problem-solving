class Solution {
    public boolean canJump(int[] nums) 
    {
        int reachable = 0;
        int n = nums.length;

        for(int i=0;i<n;i++)
        {
            if(reachable >= n) return true;
            if(reachable>=i)
            {
                reachable = Math.max(reachable,i+nums[i]);
            }

            if(reachable<i) return false;
        }
        return true;
        
    }
}