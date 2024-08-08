class Solution {
    public int removeDuplicates(int[] arr) {
        
        int i=0,j=0,n=arr.length;
        
        while(j<n)
        {
            if(arr[j]!=arr[i])
            {
                arr[++i]=arr[j];
            }
            
            j++;
        }
        
        return i+1;    
        
    }
}