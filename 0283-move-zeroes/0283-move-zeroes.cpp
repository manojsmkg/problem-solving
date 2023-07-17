class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        
        int n=nums.size();
        
        for(int i=0;i<n-1;i++)
        {
            if(nums[i] == 0)
            {
                int j = i+1;
                while(nums[j]==0 && j<n-1)
                    j++;
                swap(nums[i],nums[j]);
            }
        }
        
    }
};