class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int m = ransomNote.length();
        int n = magazine.length();
        int[] count = new int[26];
        for(int i=0;i<n;i++)
        {
            count[magazine.charAt(i) - 'a']++;
        }
        for(int i=0;i<m;i++)
        {
            if(count[ransomNote.charAt(i)-'a'] == 0) return false;
            count[ransomNote.charAt(i)-'a']--;
        }
        return true;
    
    }
}