class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int rows = a.length;
        int cols = a[0].length;
        int low=0,high=rows-1,probable_row = high;
        while(rows>1 && low<=high)
        {
            int mid = (low+high)/2;
            System.out.println(low + " " +high + " "+ mid);
            if(a[mid][0] <= target && a[mid][cols-1]>=target) {probable_row=mid;break;}
            else if(a[mid][0]>target) high=mid-1;
            else
                low = mid+1;
        }
        low=0;high=cols-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[probable_row][mid]==target) return true;
            else if(a[probable_row][mid]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
        
    }
}