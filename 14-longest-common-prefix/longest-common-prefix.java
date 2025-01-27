
class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        int n = strs.length;
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[n-1];
        int i = 0;
        int j = 0;
        while(i<s1.length() && j<s2.length() && s1.charAt(i)==s2.charAt(j))
        {
            i++;
            j++;
        }

        return s1.substring(0,i);
    }
}