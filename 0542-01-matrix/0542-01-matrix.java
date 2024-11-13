class Node
{
    int x;
    int y;
    int dist;
    public Node(int x,int y,int dist)
    {
        this.x=x;
        this.y=y;
        this.dist = dist;
    }
}

class Solution {
    public boolean isValid(int i,int j,int m,int n,int[][] visited)
    {
        return i>=0 && i<m && j>=0 && j<n && visited[i][j] == 0;
    }
    
    public int[][] updateMatrix(int[][] mat) 
    {
        Queue<Node> q = new LinkedList<>();
        
        int m=mat.length;
        int n=mat[0].length;
        
        int[][] result = new int[m][n];
        int[][] visited = new int[m][n];
        
        int[][] allDirs = {{-1,0},{1,0},{0,-1},{0,1}};
        
        for(int i = 0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                if(mat[i][j]==0) 
                {
                    q.add(new Node(i,j,0));
                    visited[i][j]=1;
                }
        }
        
        while(q.isEmpty() == false)
        {
            int x = q.peek().x;
            int y = q.peek().y;
            int dist = q.peek().dist;
            result[x][y] = dist;
            q.remove();
            for(int ind = 0;ind<4;ind++)
            {
                int nx = x+allDirs[ind][0];
                int ny = y+allDirs[ind][1];
                if(isValid(nx,ny,m,n,visited)) 
                {
                    visited[nx][ny]=1;
                    q.add(new Node(nx,ny,dist+1));
                }
            }
        }
        return result;   
    }
}