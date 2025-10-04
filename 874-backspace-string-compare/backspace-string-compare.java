class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for( Character ch : s.toCharArray())
        {
            if(ch.equals('#') )
              {
                 if(!s1.isEmpty()) s1.pop();
              }

            else
            {
                                s1.push(ch);
            }
        }
        for(Character ch :  t.toCharArray())
        {
            if(ch.equals('#') )
             { if(!s2.isEmpty() ) s2.pop(); }

            else
                {
                    s2.push(ch);
                }
        }

        while(!s1.isEmpty() && !s2.isEmpty())
        {
            if(!s1.pop().equals(s2.pop())) return false;
        }

        if(s1.isEmpty() && s2.isEmpty()) return true;
        else return false;
        
    }
}