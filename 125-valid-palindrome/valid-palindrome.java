class Solution {
    public boolean isPalindrome(String s) 
    {
        String newString = s.toLowerCase();

        String tempString = "";
        for(int i=0;i<newString.length();i++)
        {
            if(
                (newString.charAt(i)>='a' && newString.charAt(i)<='z') 
               ||  (newString.charAt(i)>='0' && newString.charAt(i)<='9') 
            ) 
            tempString+=newString.charAt(i);
        }

        int left = 0;
        int right = tempString.length()-1;
        while(left<right)
        {
            if(tempString.charAt(left) != tempString.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}