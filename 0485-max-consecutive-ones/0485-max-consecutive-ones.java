class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) sum=0;
            else
            {
                sum+=nums[i];
                maxi=Math.max(sum,maxi);
            }
        }
        return maxi;
        
    }
}