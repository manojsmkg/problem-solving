class Solution {
public:
    int maxSubArray(vector<int>& nums) {
int cmax=nums[0],gmax=nums[0],n=nums.size();
        
        for(int i=1;i<n;i++)
        {
            cmax=max(nums[i],nums[i]+cmax);
            gmax=max(cmax,gmax);
        }
        return gmax;
    }
};