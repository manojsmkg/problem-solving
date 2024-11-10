class Solution {
    public String largestOddNumber(String num) 
    {
        
        String result = "";
        int startIndex = -1;
        
        
        for(int i=0;i<num.length();i++)
        {
            if(num.charAt(i) == '1' || num.charAt(i) == '3' || num.charAt(i) == '5' || num.charAt(i) == '7' || num.charAt(i) == '9')
            {
                result = num.substring(0,i+1);
             
            }
        }
        return result;
    }
}