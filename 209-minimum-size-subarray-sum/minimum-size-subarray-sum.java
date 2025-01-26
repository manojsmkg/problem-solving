class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int n = nums.length;
        int start=0;
        int end=0;
        int res = Integer.MAX_VALUE;
        if(n==0) return 0;
        int sum = 0;
        boolean found = false;
        while(end<n)
        {
            while(end<n && sum<target)
            {
                sum+=nums[end];
                end++;
            }
            while(start<end && sum>=target)
            {
                res = Math.min(res,end-start);
                found = true;
                sum-=nums[start++];      
            }
            System.out.println(start + " " + end + " " + sum);
            
        }
        return found?res:0;      
    }
}