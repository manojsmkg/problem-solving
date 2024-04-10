class Solution {
public:
    void sortColors(vector<int>& a) {
        int n=a.size();
        int i=0,j=n-1,k=0;
        while(k<=j)
        {

            if(a[k]==0 )
            {
                swap(a[i++],a[k++]);
                
            }
            else if(a[k]==1) {k++;}
            else
            {
                swap(a[k],a[j--]);
            }            
        }
        
    }
};