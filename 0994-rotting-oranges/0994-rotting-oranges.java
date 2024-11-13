class Solution {
    
    public boolean isValid(int i,int j,int m,int n,int[][] grid)
    {
        return (i>=0) && (i<m) && (j>=0) && (j<n) && grid[i][j]==1;
    }
    
    public int orangesRotting(int[][] grid) 
    {
        if(grid == null) return -1;
        Queue<Pair<Integer,Integer>> rottenQ = new LinkedList<>();
        int m=grid.length;
        int n= grid[0].length;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==2) rottenQ.add(new Pair(i,j));
            }
        }
        int result = -1;
        int[] x= {1,-1,0,0};
        int[] y= {0,0,1,-1};
        
        while(rottenQ.isEmpty() == false)
        {
            int k=rottenQ.size();
            if(k>0) result++;
            while(k>0)
            {
                Pair<Integer,Integer> currPair = rottenQ.poll();            
                for(int ind=0;ind<4;ind++)
                {
                    if(isValid(currPair.getKey()+x[ind],currPair.getValue()+y[ind],m,n,grid))
                    {
                        rottenQ.add(new Pair(currPair.getKey()+x[ind],currPair.getValue()+y[ind]));
                        grid[currPair.getKey()+x[ind]][currPair.getValue()+y[ind]] = 2;
                    }
                }
                k--;
            }
            
        }
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1) return -1;
            }
        }
        return result==-1?0:result;
    }
}