class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int i=0,j=1,k=0,n=nums.size();
        vector<int> a(n,0);
        for(int k=0;k<n;k++)
        {
           if(nums[k]<0)
           {
               a[j]=nums[k];
               j+=2;
           }
            else
            {
                a[i]=nums[k];
                i+=2;
            }
        }
        return a;
    }
};