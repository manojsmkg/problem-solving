class Solution {
    public int singleNonDuplicate(int[] a) {
        int low = 0,high = a.length-1,n=a.length;
        int ans=-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if((mid==0 || a[mid]!=a[mid-1]) && (mid+1==n || a[mid]!=a[mid+1]))
            {ans = a[mid];break;}
            else if((mid%2==1 && a[mid]==a[mid-1]) || (mid%2==0 && a[mid]==a[mid+1])) 
            low=mid+1;
            else high=mid-1;
        }
        return ans;
        
    }
}