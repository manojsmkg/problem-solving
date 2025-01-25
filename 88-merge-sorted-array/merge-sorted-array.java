class Solution {

    public void swap(int a,int b)
    {
        int temp = a;
        a=b;
        b=temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int i=0,j=0,k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[0])
                i++;
            else if(nums1[i]>nums2[0])
            {
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[j] = temp;
                k=0;
                while(k+1<n && nums2[k] > nums2[k+1])
                {
                    temp = nums2[k];
                    nums2[k] = nums2[k+1];
                    nums2[k+1] = temp;
                    k++;
                }           
                i++;
            }
        }
        while(j<n)
        {
            nums1[i++] = nums2[j++];
        }
    }
}