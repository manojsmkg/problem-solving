class Solution {
    public List<String> summaryRanges(int[] nums) 
    {
        List<String> intervals = new ArrayList<>();
        int n = nums.length;
        if(n==0) return intervals;
        int start = nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]-1!=nums[i-1])
                {
                    if(start==nums[i-1] )  intervals.add(start+""); 
                    else intervals.add(start+"->"+nums[i-1]);
                    start = nums[i];
                }
        }
        
        if(start == nums[n-1] ) intervals.add(start+""); 
        else intervals.add(start+"->"+nums[n-1]);
        
        return intervals;  
    }
}