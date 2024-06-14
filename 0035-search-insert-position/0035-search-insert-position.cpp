class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int low = 0,high=nums.size()-1;
        int ans = 0;bool ansUpdated = false;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]<=target) {ans=mid;low = mid+1;ansUpdated=true;}
            else high = mid-1;
        }
        return nums[ans]==target?ans:(ansUpdated?ans+1:ans);   
    }
};