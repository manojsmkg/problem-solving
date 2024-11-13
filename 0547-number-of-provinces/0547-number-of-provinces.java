class Solution {
    void dfs(int[] visited,List<List<Integer>> adj,int currNode)
    {
        List<Integer> currAdj = adj.get(currNode);
        for(int i:currAdj)
        {
            if(visited[i]==1) continue;
            visited[i]=1;
            dfs(visited,adj,i); 
            
        }
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj= new ArrayList<>();
        int result = 0;
        int[] visited = new int[isConnected.length];
        
        for(int i=0;i<isConnected.length;i++)
          adj.add(new ArrayList<Integer>());
        
        for(int i=0;i<isConnected.length;i++)
        {
            List<Integer> currAdj = adj.get(i);
            
            for(int j=0;j<isConnected[i].length;j++)
            {
                if(i==j) continue;
                if(isConnected[i][j]==1) currAdj.add(j);
            }
        }
        
        
        for(int i=0;i<adj.size();i++)
        {
            if(visited[i]==0) 
            {
                visited[i]=1;
                dfs(visited,adj,i);
                result++;
            }
        }
        return result;
        
    }
}