class Solution {

    public boolean wordSearchUtil(char[][] board,int m,int n,int x,int y,String word,int ind,int[][] visited)
    {
        int[] xDirs = {0,-1,0,1};
        int[] yDirs = {-1,0,1,0};
        visited[x][y]=1;
        if(ind==word.length()) return true;
        for(int i=0;i<4;i++)
        {
            int newX = x+xDirs[i];
            int newY = y+yDirs[i];
            if(newX>=0 && newX<m && newY>=0 && newY<n && visited[newX][newY] == 0)
            {  
                if(board[newX][newY] == word.charAt(ind)) 
                {  
                    if(wordSearchUtil(board,m,n,newX,newY,word,ind+1,visited) == true) return true;
                    else visited[newX][newY] = 0;
                }
            }
        }
        return false;
    
    }

    public boolean exist(char[][] board, String word) 
    {
        int m=board.length;
        int n=board[0].length;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(word.charAt(0) == board[i][j])
                {
                   if(wordSearchUtil(board,m,n,i,j,word,1,new int[m][n])==true)
                    return true;
                }
            }
        }
        return false;

        
    }
}