class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        
        Map<Character,Character> replace = new HashMap<>();
        Map<Character,Character> reverse = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(!replace.containsKey(s.charAt(i)))
            {
                if(reverse.containsKey(t.charAt(i))) return false;
                replace.put(s.charAt(i),t.charAt(i));
                reverse.put(t.charAt(i),s.charAt(i));
            }
            else
            {
                if(replace.get(s.charAt(i)) != t.charAt(i)) return false;
            }
        }
        return true;
    }
}