class Solution {

    public boolean isValidParanthesis(String paranthesis)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<paranthesis.length();i++)
        {
            if(paranthesis.charAt(i) == '(') s.push(paranthesis.charAt(i));
            else
            {
                if(s.isEmpty() == true) return false;
                s.pop();
            }
        }
        if(s.isEmpty() == false) return false;
        return true;
    }

    public void generateAllPossibleParantheses(int n,int i,String res,List<String> finalRes)
    {
        if(i==n) {
            if(isValidParanthesis(res) == true)
            {
                finalRes.add(res);
            }
            return;
        }
        generateAllPossibleParantheses(n,i+1,res+"(",finalRes);
        generateAllPossibleParantheses(n,i+1,res+")",finalRes);
    }
    public List<String> generateParenthesis(int n) 
    {
        List<String> finalRes = new ArrayList<>();
        generateAllPossibleParantheses(n*2,0,"",finalRes);
        return finalRes;
    }
}