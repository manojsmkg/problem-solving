class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int i=0,j=1;
        int n=nums.length;
        int ct = 1;
        for(i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            {
                ct++;
            }
            else
            {
                ct = 1;
            }

            if(ct<=2)
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;      
    }
}