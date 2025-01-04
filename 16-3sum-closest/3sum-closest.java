class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int closest = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0;i<n;i++)
        {
            int r = n-1;
            int l=i+1;
            while(l<r)
            {
                int currSum = nums[i] + nums[l] + nums[r];
                if(Math.abs(target-currSum)<diff)
                {
                    diff = Math.abs(target-currSum);
                    closest = currSum;
                }
                if(currSum<target) l++;
                else r--;
            }
        }
        return closest;
    }
}