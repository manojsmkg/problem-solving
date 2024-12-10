class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.isEmpty() == true) return false;
                if(s.charAt(i)=='}' && st.pop() != '{') return false;
                else if(s.charAt(i) == ']' && st.pop() != '[') return false;
                else if(s.charAt(i) == ')' && st.pop() != '(') return false;
            }
        }
        if(st.size()>0) return false;
        return true;
    }
}