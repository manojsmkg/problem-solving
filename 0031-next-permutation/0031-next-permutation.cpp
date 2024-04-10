class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int breakingPoint = -1;
        
        int n=nums.size();
        
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                breakingPoint = i;
                cout<<"found breakingpoint "<<breakingPoint<<endl;
                break;
            }
        }
        if(breakingPoint==-1)
        {
            reverse(nums.begin(),nums.end());
            return;
        }
        int swapElement=breakingPoint;
        for(int i=n-1;i>breakingPoint;i--)
        {
            if(nums[i]>nums[breakingPoint] )
            {
                cout<<"found biggest ele "<<i<<endl;
        swap(nums[breakingPoint],nums[i]);
                break;
            }
        }
                        cout<<"swapping done" << endl;
    for(int i=0;i<n;i++)
        cout<<nums[i]<<" ";
                                cout<<endl<<"reverse done" << endl;

        reverse(nums.begin()+breakingPoint+1,nums.end());  
            for(int i=0;i<n;i++)
        cout<<nums[i]<<" ";
    }
};