class Solution {
    public int minPathSum(int[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        
         int dp[][] = new int[m][n];
         dp[0][0] = grid[0][0];
        
        for(int i=1;i<m;i++) dp[i][0] = dp[i-1][0] + grid[i][0];
        for(int j=1;j<n;j++) dp[0][j] = dp[0][j-1] + grid[0][j];
        int[][] allDirs = {{-1,0},{0,-1}};
        
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                dp[i][j] = Integer.MAX_VALUE;
                for(int ind=0;ind<allDirs.length;ind++)
                if(i+allDirs[ind][0]>=0 && i+allDirs[ind][0] < m && j+allDirs[ind][1] >=0 && j+allDirs[ind][1] < n)
                   dp[i][j] = Math.min(dp[i][j] , dp[i+allDirs[ind][0]][j+allDirs[ind][1]] + grid[i][j]);
            }
        }
       
        return dp[m-1][n-1];
        
    }
}