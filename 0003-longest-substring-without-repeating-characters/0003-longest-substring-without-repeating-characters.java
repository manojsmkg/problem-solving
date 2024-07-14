class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> a = new HashSet<>();
        if(s.length()==0) return 0;
        int i=0,n=s.length();
        int j=1;
        a.add(s.charAt(0));
        int maxi=1;
        while(j<n)
        {
            if(a.contains(s.charAt(j)))
            {
               a.remove(s.charAt(i));
               i++;                
            }
            else { a.add(s.charAt(j));maxi=Math.max(maxi,a.size());j++;}
           
        }
        return maxi;
    }
}