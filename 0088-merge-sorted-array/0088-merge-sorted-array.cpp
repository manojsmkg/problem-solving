class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(n==0 ) return ;
        
        vector<int>:: iterator itr=nums1.begin();
        vector<int>:: iterator itr1=nums2.begin();
        
        while(itr1!=nums2.end())
        {
            if(m == 0)
            {
                *itr=*itr1;
                itr1++;
                n--;
                itr++;
                continue;
            }
            
            else if(m>0 && n>=0 && *itr<=*itr1)
            {
                if(m>0) itr++;
                m--;
                continue;
            }
            
            else 
            {
                int temp = *itr;
                *itr = *itr1;
                *itr1 = temp;
                sort(nums2.begin(),nums2.end());
                if(m>0) itr++;
                m--;
            }
            }
    }
};