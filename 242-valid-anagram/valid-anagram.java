class Solution {
    public boolean isAnagram(String s, String t) 
    {
        int[] count = new int[26];
        int m = s.length();
        int n = t.length();
        if(m!=n) return false;

        for(int i=0;i<m;i++)
            count[s.charAt(i)-'a']++;
        
        for(int i=0;i<n;i++)
        {
            if(count[t.charAt(i)-'a'] == 0) return false;
            count[t.charAt(i)-'a']--;
        }
        return true;
       
    }
}