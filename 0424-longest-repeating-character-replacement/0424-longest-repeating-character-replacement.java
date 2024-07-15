class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,right=0,n=s.length(),maxi=0,res=0;
        int[] a=new int[26];
        while(right<n)
        {
            a[s.charAt(right)-'A']++;
            maxi=Math.max(maxi,a[s.charAt(right)-'A']);
            if(right-left-maxi+1>k) {
                a[s.charAt(left)-'A']--;
                left++;
            }
            else res=Math.max(res,right-left+1);
            right++;
        }
        return res;
        
    }
}