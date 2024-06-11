class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> finalRes;
        int i=0,n=nums.size();
        
        for(int i=0;i<n-1;i++)
        {
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int j=i+1,k=n-1;
            
            while(j<k) {
            int curSum = nums[i]+nums[j]+nums[k];
            if(curSum == 0) {
                vector<int> curRes = {nums[i],nums[j],nums[k]};
                finalRes.push_back(curRes);
                j++;
                k--;
                                while(j<k && nums[j] == nums[j-1]) j++;
                while(j<k && nums[k] == nums[k+1]) k--;

            }
            else if(curSum<0)
            {
                j++;
                while(j<k && nums[j] == nums[j-1]) j++;
            }
            else
            {
                k--;
                while(j<k && nums[k] == nums[k+1]) k--;
            }
            }
        }
        return finalRes;
    }
};