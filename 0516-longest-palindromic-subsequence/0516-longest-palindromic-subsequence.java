class Solution {
    public int longestPalindromeSubseq(String s) 
    {
        int n = s.length();
//        StringBuilder rev = new StringBuilder(s);
//        String reverse = rev.reverse().toString();
        
        if(n==1) return n;
        int[][] dp = new int[n+1][n+1];
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s.charAt(i-1) == s.charAt(n-j)) 
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][n];
    }
}