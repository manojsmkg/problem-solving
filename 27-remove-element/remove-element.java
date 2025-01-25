class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int n=nums.length;
    
        if(n==0 || (n==1 && val == nums[0]) ) return 0;

        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] != val)
            {
               int temp = nums[j];
               nums[j]=nums[i];
               nums[i] = temp;
               j++;
            }
        }
        return j;
        
    }
}