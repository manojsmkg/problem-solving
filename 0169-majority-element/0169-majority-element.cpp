class Solution {
public:
    int majorityElement(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int maxCount = 1,currMaxCount = 1;
        int majElement=nums[0];
        for(int i=1;i<nums.size();i++)
        {
            if(nums[i]==nums[i-1]) 
            {
                currMaxCount++;
                if(currMaxCount>maxCount) {majElement = nums[i];maxCount=currMaxCount;}
            }
            else currMaxCount = 1;
        }
        return majElement;
    }
};