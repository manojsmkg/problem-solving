class Solution {
public:
    void sortColors(vector<int>& a) {
        
        int i=0,j=0,k=a.size()-1;
        
        while(j<=k)
        {
            if(a[j] == 0)
                swap(a[i++],a[j++]);
            
            else if(a[j]==1)
                j++;
            else swap(a[j],a[k--]);
        }
        
    }
};