class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        
        int n = nums.size();
        
        int lmax=0,gmax=0;
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                lmax++;
            }
            else
            {
                gmax= max(gmax,lmax);
                lmax = 0;
            }
        }
        
        return max(gmax,lmax);
        
    }
};