class Solution {
    public int majorityElement(int[] nums) {
        int el = nums[0];
        int n = nums.length;
        int ct = 1;
        for(int i=1;i<n;i++)
        {
            if(nums[i] == el) ct++;
            else ct--;
            if(ct == 0) {
                el = nums[i];
                ct = 1;
            }
        }
        ct = 0;
        for(int i=0;i<n;i++)
        {
            if(el == nums[i])
                ct++;
        }
        if(ct>=(n/2)) return el;
        return -1;
        
    }
}