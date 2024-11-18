class Solution {
    public int minInsertions(String s) 
    {
        int n = s.length();
        
        int[][] dp = new int[n+1][n+1];
        int[] curr = new int[n+1];
        int[] prev = new int[n+1];
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s.charAt(i-1) == s.charAt(n-j))
                {
                    curr[j] = prev[j-1] + 1;
                }
                else
                    curr[j] = Math.max(prev[j],curr[j-1]);
            }
            prev = curr.clone();
        }
        return n - curr[n];
    }
}