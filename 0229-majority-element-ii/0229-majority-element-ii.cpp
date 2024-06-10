class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> result;
        int n=nums.size();
        int cnt1=0,cnt2=0,el1=INT_MIN,el2=INT_MIN;
        for(int i=0;i<n;i++)
        {
            if(cnt1==0 && el2!=nums[i]) {cnt1=1;el1=nums[i];}
            else if(cnt2==0 && el1!=nums[i]) {cnt2=1;el2=nums[i];}
            else if(nums[i]==el1) cnt1++;
            else if(nums[i]==el2) cnt2++;
            else {cnt1--;cnt2--;};
        }
        
        int el1C=0,el2C=0;
        for(int i=0;i<n;i++)
        {
            if(el1==nums[i]) el1C++;
            if(el2==nums[i]) el2C++;
        }
        if(el1C>n/3) result.push_back(el1);
        if(el2C>n/3) result.push_back(el2);
        return result;
     
    }
};