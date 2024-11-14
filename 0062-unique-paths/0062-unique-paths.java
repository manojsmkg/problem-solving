class Solution 
{
    public int uniquePaths(int m, int n) 
    {
        int dp[][] = new int[m][n];
        
        for(int i=0;i<m;i++) dp[i][0] = 1;
        for(int j=0;j<n;j++) dp[0][j] = 1;
        int[][] allDirs = {{-1,0},{0,-1}};
        
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                for(int ind=0;ind<allDirs.length;ind++)
                if(i+allDirs[ind][0]>=0 && i+allDirs[ind][0] < m && j+allDirs[ind][1] >=0 && j+allDirs[ind][1] < n)
                   dp[i][j] = dp[i][j] + dp[i+allDirs[ind][0]][j+allDirs[ind][1]];
            }
        }
        return dp[m-1][n-1];
    }
}