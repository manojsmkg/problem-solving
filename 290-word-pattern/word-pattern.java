class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        Map<Character,String> charMap = new HashMap<>();
        Map<String,Character> revMap = new HashMap<>();
        String[] words = s.split(" ");
        int m=pattern.length();
        int n =words.length;
        if(m!=n) return false;
        for(int i=0;i<n;i++)
        {
            if(charMap.containsKey(pattern.charAt(i)))
            {
                if(!words[i].equals(charMap.get(pattern.charAt(i)))) return false;
            }
            if(revMap.containsKey(words[i]) && revMap.get(words[i])!=pattern.charAt(i)) return false;
            charMap.put(pattern.charAt(i),words[i]);
            revMap.put(words[i],pattern.charAt(i));
        }
        return true;
    }
}