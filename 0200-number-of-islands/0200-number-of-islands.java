class Solution {
    
    public void dfs(char[][] grid,int[][] visited, int i,int j, int m, int n)
    {
       int[][] allDirs = {{1,0},{-1,0},{0,1},{0,-1}};
       
        for(int p=0;p<4;p++)
            {
                int x = i+allDirs[p][0];
                int y = j+allDirs[p][1];
            if((x>=0 && x<m && y>=0 && y<n) && grid[x][y] == '1' && visited[x][y]==0) 
            {
                visited[x][y]=1;
                dfs(grid,visited,x,y,m,n);
            }
            }
        }
        
    
    
    
    
    public int numIslands(char[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] visited = new int[m][n];
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1' && visited[i][j]==0) {
                    visited[i][j]=1;
                    count++;
                    dfs(grid,visited,i,j,m,n);
                    
            }
        }
        }
        
            return count;
        
    }
}