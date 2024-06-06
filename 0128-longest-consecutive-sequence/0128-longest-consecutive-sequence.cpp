class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n=nums.size();
        if(n==0 ) return 0;
        
        unordered_set<int> numsSet;
       // int maxi=nums[0];
        
        for(int i=0;i<n;i++)
        {
            numsSet.insert(nums[i]);
           // maxi = max(maxi,nums[i]);
        }
        
        int maxLen = 1;
        //int currLen = 1;
        
        for(auto curr:numsSet)
        {
            if(numsSet.find(curr-1)==numsSet.end())
            {
                int currLen=1;
                int currEl = curr;
                while(numsSet.find(++currEl)!=numsSet.end())
                {
                    currLen++;
                }
                maxLen =  max(currLen,maxLen);
            }
        }
        return maxLen;
        
        
    }
};