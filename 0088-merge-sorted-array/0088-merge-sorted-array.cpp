class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i=0,j=0;
        if(n==0) return;
        
        while(i<m)
        {
            if(nums1[i]>nums2[j]){
                swap(nums1[i],nums2[j]);
                int k=j;
                while(k+1<n && nums2[k]>nums2[k+1]) {swap(nums2[k],nums2[k+1]);k++;}       
            }
            i++;
        }
        int k=0;
        while(i<nums1.size() && k<n)
        {
            nums1[i++] = nums2[k++];
        }
        
    }
};