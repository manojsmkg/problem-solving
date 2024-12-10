class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> charSet = new HashSet<>();
        if(s.length()==0) return 0;
        int maxLen = 1;
        int start = 0;
        int end = 1;
        charSet.add(s.charAt(0));
        int n = s.length();
        while(end<n && start<=end)
        {
            while(start<end && charSet.contains(s.charAt(end)) == true) 
             {
                 charSet.remove(s.charAt(start));
                 start++;
             }
             if(charSet.contains(s.charAt(end)) == false) charSet.add(s.charAt(end));
             
            maxLen = Math.max(charSet.size(),maxLen);
            end++;
        }
        return maxLen;
    }
}