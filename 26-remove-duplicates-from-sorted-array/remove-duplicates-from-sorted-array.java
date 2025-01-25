class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0,j=0,n=arr.length;
        for( j=0;j<n;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}