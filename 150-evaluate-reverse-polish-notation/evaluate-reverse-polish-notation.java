class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> operands = new Stack<>();
        int res = 0;

        for(String s : tokens)
        {
            if(s.equals("+"))
            {
                int op1 = operands.pop();
                int op2 = operands.pop();
                operands.push(op1+op2);
            }
            else if (s.equals("-"))
            {
                int op1 = operands.pop();
                int op2 = operands.pop();
                operands.push(op2-op1);
            }
            else if (s.equals("*"))
            {
                int op1 = operands.pop();
                int op2 = operands.pop();
                operands.push(op2*op1);
            }
            else if (s.equals("/"))
            {
                int op1 = operands.pop();
                int op2 = operands.pop();
                operands.push(op2/op1);
            }
            else operands.push(Integer.parseInt(s));
        }
        return operands.pop();    
    }
}