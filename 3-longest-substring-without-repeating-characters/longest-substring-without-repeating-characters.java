class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
     Set<Character> charSet = new HashSet<>();
     int n = s.length();
    
     int start = 0;
     int end = 0;
     int len = 0;
     while(start<n && end<n)
     {
        while(end<n && charSet.contains(s.charAt(end))==false)
        {
            charSet.add(s.charAt(end));
            end++;
            len = Math.max(len,charSet.size());
        }
        while(end<n && charSet.contains(s.charAt(end))==true)
        {
            charSet.remove(s.charAt(start));
            start++;
        }

     }
     return len;

    }
}