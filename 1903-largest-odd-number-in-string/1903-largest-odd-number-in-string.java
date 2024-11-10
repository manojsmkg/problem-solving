class Solution {
    public String largestOddNumber(String num) 
    {
        
        String result = "";
        int startIndex = -1;
        
        
        for(int i=0;i<num.length();i++)
        {
            if(Integer.parseInt(num.charAt(i)+"")%2 == 1)
            {
                result = num.substring(0,i+1);
             
            }
        }
        return result;
    }
}