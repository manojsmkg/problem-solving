class Solution {
    public int lengthOfLastWord(String s) 
    {
        int ans = 0;
        int n = s.length();
        int temp = 0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=' ')
            {
                temp++;
                ans = temp;
            }
            else
            {
                if(temp>0) ans = temp;
                temp = 0;
            }
        }
        return ans;
        
    }
}