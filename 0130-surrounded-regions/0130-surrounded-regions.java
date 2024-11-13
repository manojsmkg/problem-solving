class Solution {
    
    public boolean isValid(char[][] board,int x,int y,int[][] visited)
    {
        return x>=0 && x<board.length && y>=0 && y<board[0].length && visited[x][y]==0 && board[x][y] == 'O';
    }
    public void dfs(char[][] board,int x,int y,int[][] visited)
    {
        board[x][y] = 'Y';
       // System.out.println(x+ " "+y);
        int[][] allDirs = {{-1,0},{1,0},{0,1},{0,-1}};
        for(int ind = 0;ind<4;ind++)
        {
            int nx = x+allDirs[ind][0];
            int ny = y+allDirs[ind][1];
            if(isValid(board,nx,ny,visited)) 
            {
                visited[nx][ny]=1;
                dfs(board,nx,ny,visited);
            }
        }
        
    }
    public void solve(char[][] board) 
    {
        int m=board.length;
        int n=board[0].length;
        int[][] visited = new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            if(visited[i][0]==1 || board[i][0] == 'X') continue;
            visited[i][0]=1;
         //   System.out.println("calling dfs " + (i) + " " + 0 + " " + board[i][0]);
            dfs(board,i,0,visited);
        }
        for(int i=0;i<m;i++)
        {
            if(visited[i][n-1] == 1 || board[i][n-1] == 'X') continue;
            visited[i][n-1] = 1;
           // System.out.println("calling dfs " + i + " " + (n-1) + " " + board[i][n-1]);
            dfs(board,i,n-1,visited);
        }
        for(int j=0;j<n;j++)
        {
            if(visited[0][j] == 1 || board[0][j] == 'X') continue;
            visited[0][j]=1;
           // System.out.println("calling dfs " + (0) + " " + j + " " + board[0][j]);
            dfs(board,0,j,visited);
        }
        for(int j=0;j<n;j++)
        {
            if(visited[m-1][j]==1 || board[m-1][j] == 'X') continue;
            visited[m-1][j]=1;
          //  System.out.println("calling dfs " + (m-1) + " " + j + " " + board[m-1][j]);
            dfs(board,m-1,j,visited);
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == 'Y') board[i][j] = 'O';
            }
        }
    }
        
    
}