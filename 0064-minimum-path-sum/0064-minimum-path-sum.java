class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        int minScore[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++) {
                
            if(i==0&&j==0) minScore[i][j]=grid[i][j];
            else if(i==0)  minScore[i][j]=minScore[i][j-1]+grid[i][j];
            else if(j==0) minScore[i][j]=minScore[i-1][j]+grid[i][j];
                else{
            int up=0,left=0;
            if(i-1>=0) up=minScore[i-1][j];
            if(j-1>=0) left=minScore[i][j-1];
            minScore[i][j]=Math.min(up,left)+grid[i][j];
                }
        }}

     return minScore[m-1][n-1];   
    }
}