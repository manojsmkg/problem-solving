class Solution {
    public int jump(int[] nums) {
        
        int n=nums.length;
        if(n==1) return 0;
        int jumps = 0;
        int reachable = 0;
        int maxi = 0;

        for(int i=0;i<n;i++)
        {
           maxi = Math.max(maxi,nums[i]+i);
           if(i==reachable)
           {
            reachable = maxi;
            jumps++;
            if(maxi>=n-1) break;
           }
        }
        return jumps;       
    }
}