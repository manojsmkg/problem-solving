class Solution {
    public int majorityElement(int[] nums) {
        int ct=0,el=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(ct == 0) 
            {
                el = nums[i];
                ct = 1;
            }
            else if(el==nums[i]) ct++;
            
            else ct--;
        }
        return el;
    }
}