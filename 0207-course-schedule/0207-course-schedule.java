class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses<=1) return true;
        int[] inDegree = new int[numCourses];
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        int rows = prerequisites.length;
        for(int i=0;i<rows;i++)
        {
            ArrayList<Integer> currAdj = adj.get(prerequisites[i][0]);
            currAdj.add(prerequisites[i][1]);            
            inDegree[prerequisites[i][1]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            ArrayList<Integer> currAdj = adj.get(i);
            System.out.print(i+" ");
            for(int adjNode:currAdj)
            {
                System.out.print(adjNode+" ");
            }
            System.out.println("\n"+inDegree[i]);
            if(inDegree[i]==0) {q.add(i);}
        }
        
        if(res.size()>0 && q.size()==0) return false;
        
        while(!q.isEmpty())
        {
            int currNode = q.poll();
            res.add(currNode);
            ArrayList<Integer> currAdj = adj.get(currNode);
            for(int adjNode: currAdj)
            {
                inDegree[adjNode]--;
                if(inDegree[adjNode]==0) q.add(adjNode);
            }
        }
        if(res.size()<numCourses) return false;
        return true;
                
    }
}