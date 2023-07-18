class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int xorOutput=0;
        
        for(int i=0;i<nums.size();i++)
        {
            xorOutput = xorOutput ^ nums[i];
        }
        return xorOutput;
        
    }
};