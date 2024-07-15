class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj,int[] visited,int curr)
    {
        visited[curr]=1;
        ArrayList<Integer> currAdj=adj.get(curr);
        for(int newInd:currAdj)
        {
            if(visited[newInd]==1) continue;
            dfs(adj,visited,newInd);
        }
        
    }
    public int findCircleNum(int[][] a) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<a.length;i++) adj.add(new ArrayList<Integer>());
        for(int i=0;i<a.length;i++)
        {
            ArrayList<Integer> currAdj = adj.get(i);
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]==1) currAdj.add(j);
            }
        }
        int res=0;
        int visited[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            if(visited[i]==1) continue;
            res++;
            dfs(adj,visited,i);
        }
        return res;
        
    }
}