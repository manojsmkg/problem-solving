class Solution {
    public int majorityElement(int[] nums) {
        int ct=0,el=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(ct==0)
            {
                el=nums[i];
                ct++;
            }
            else if(el == nums[i]) ct++;
            else if(el!=nums[i]) ct--;
        }
        int actualCt = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]== el ) actualCt++;
        }
        if(actualCt>n/2) return el;
        return -1; 
    }
}