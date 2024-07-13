class Solution {
    public void dfs(int[][] image,int currR,int currC,int color, int[][] visited,int rows,int cols,int startC)
    {
        visited[currR][currC]=1;
        image[currR][currC]=color;
        int[][] allDir = {{-1,0},{1,0},{0,-1},{0,1}};
        for(int i=0;i<4;i++)
        {
            int newR = currR+allDir[i][0];
            int newC = currC+allDir[i][1];
            if(newR>=0 && newR<rows && newC>=0 && newC<cols && image[newR][newC]==startC && visited[newR][newC]==0)
                dfs(image,newR,newC,color,visited,rows,cols,startC);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rows=image.length;
        int cols = image[0].length;
        int[][] visited = new int[rows][cols];
        int startC=image[sr][sc];
        dfs(image,sr,sc,color,visited,rows,cols,startC);
            return image;
        
    }
}