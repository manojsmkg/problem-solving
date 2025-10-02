class Solution {
    private boolean isValid(int x,int y,int m,int n)
    {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
    private void dfs(int currX,int currY, int[][] grid,int color,int[][] visited,int m,int n,int origColor)
    {
        visited[currX][currY] = 1;

        int[] x={1,-1,0,0};
        int[] y={0,0,1,-1};
        boolean isBorder = false;
        if (currX == 0 || currX == m - 1 || currY == 0 || currY == n - 1) {
            isBorder = true; 
        }
        for(int i=0;i<4;i++)
        {
            int newX = x[i]+currX;
            int newY = y[i]+currY;

            if (isValid(newX, newY, m, n) == false || grid[newX][newY] != origColor) {
                isBorder = true;

            }           

            if(isValid(newX,newY,m,n)==true && grid[newX][newY] == origColor && visited[newX][newY]==0)
                {
                    visited[newX][newY]=1;
                    dfs(newX,newY,grid,color,visited,m,n,origColor);   
                }
        }

        if(isBorder)  visited[currX][currY] = 2; 
        
    }
    

    public int[][] colorBorder(int[][] grid, int row, int col, int color) 
    {
        int m= grid.length;
        int n= grid[0].length;
        int origColor= grid[row][col];
        int[][] visited= new int[m][n];
    
        dfs(row,col,grid,color,visited,m,n,origColor);
         for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (visited[i][j] == 2) {
                    grid[i][j] = color;
                }
            }
        }
        return grid;
    }
}

