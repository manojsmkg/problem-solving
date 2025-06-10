class Solution {
    public int majorityElement(int[] nums) 
    {
        int ct = 1;
        int el = nums[0];
        int n = nums.length;

        for(int i=1;i<n;i++)
        {
            if(el == nums[i])
                ct++;
            else
                ct--;
            if(ct==0)
                {
                    el = nums[i];
                    ct++;
                }
        }
        return el;        
    }
}