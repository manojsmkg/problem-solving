class Solution {
    public int longestOnes(int[] a, int k) {
        int left=0;
        int n=a.length;
        int right=0;
        int zeroCount=0;
        int maxi=0;
        
        while(right<n)
        {
            if(a[right] == 0) {zeroCount++;}
            while(zeroCount>k) {
                  if(a[left]==0) {zeroCount--;}
                  left++;
              } 
            right++;
            
              maxi = Math.max(maxi,right-left);
          }
        
        return maxi;    
    }
}