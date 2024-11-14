class Solution {
    public int minFallingPathSum(int[][] matrix) 
    {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] dp = new int[m][n];
        
        
        for(int j=0;j<n;j++) dp[0][j] = matrix[0][j];
        
        int mini = Integer.MAX_VALUE;
        
        for(int i=1;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int up=0,lu=Integer.MAX_VALUE,ru=Integer.MAX_VALUE;
                 up=dp[i-1][j];
                if(j-1>=0) lu = dp[i-1][j-1];
                if(j+1 < n ) ru = dp[i-1][j+1];
                dp[i][j] = Math.min(up,Math.min(lu,ru)) + matrix[i][j];
            }  
        }
        
        for(int j=0;j<n;j++)
            mini = Math.min(mini,dp[m-1][j]);
        return mini;
    }
}