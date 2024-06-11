class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        int n=nums.size();
        vector<vector<int>> finalRes;
        if(nums[0]>0 && nums[0]>target) return finalRes;
        for(int i=0;i<n;i++)
        {
            if(i!=0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++)
            {
                if(j-1!=i && nums[j]==nums[j-1]) continue;
                int k=j+1,l=n-1;
                while(k<l && j<k)
                {
                    long long curSum = nums[i];
                    curSum+=nums[j];
                    curSum+=nums[k];
                    curSum+=nums[l];
               //     cout<<curSum<<endl;
                    if(curSum == target)
                    {
                        vector<int> curRes = {nums[i],nums[j],nums[k],nums[l]};
                        finalRes.push_back(curRes);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }
                    else if(curSum<target) k++;
                    else l--;
                }
            }
        }
        return finalRes;
    }
};