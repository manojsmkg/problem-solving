class Node implements Comparable<Node>
{
    int distance;
    int price;
    int row;
    int col;

    public Node(int d,int p,int r, int c)
    {
        this.distance=d;
        this.price=p;
        this.row=r;
        this.col=c;
    }

    @Override
    public int compareTo(Node second) {
        {
            if(this.distance!=second.distance)
                return this.distance-second.distance;
            if(this.price!=second.price)
                return this.price-second.price;
            if(this.row!=second.row)
                return this.row-second.row;
            return this.col-second.col;
        }
    }

}

class Solution {

    private boolean isValid(int x,int y, int m, int n,int[][] grid)
    {
        return x>=0 && x<m && y>=0 && y<n && grid[x][y]!=0;
    }

    private void bfs(int[][] grid,int m,int n,int[][] distance,List<List<Integer>> resultList,int k,int[] pricing,int[] start)
    {
        PriorityQueue<Node> bfsQ = new PriorityQueue<>();
        bfsQ.offer(new Node(0,grid[start[0]][start[1]],start[0],start[1]));
        int[] x = {1,-1,0,0};
        int[] y = {0,0,1,-1};

        while(bfsQ.isEmpty()==false && resultList.size()<k)
        {
            Node currPoint=bfsQ.poll();
            distance[currPoint.row][currPoint.col] = currPoint.distance;
            if(currPoint.price>=pricing[0] && currPoint.price<=pricing[1]) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(currPoint.row);
                tempList.add(currPoint.col);
                resultList.add(tempList);
            }
            int newDistance = currPoint.distance+1;
        for(int i=0;i<4;i++)
        {
            int newX = currPoint.row+x[i];
            int newY = currPoint.col+y[i];
            if(isValid(newX,newY,m,n,grid) && (distance[newX][newY]==-1)) 
            {
                distance[newX][newY] = newDistance;
                bfsQ.offer(new Node(newDistance,grid[newX][newY],newX,newY));
            }
        }
        }
    }

    public List<List<Integer>> highestRankedKItems(int[][] grid, int[] pricing, int[] start, int k) 
    {
        int[][] distance = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                distance[i][j]=-1;
        List<List<Integer>> resultList = new ArrayList<>();
        bfs(grid,grid.length,grid[0].length,distance,resultList,k,pricing,start);
        return resultList;
    }
}