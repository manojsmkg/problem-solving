class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        int rows = prerequisites.length;
        for(int i=0;i<rows;i++)
        {
            ArrayList<Integer> currAdj = adj.get(prerequisites[i][1]);
            currAdj.add(prerequisites[i][0]);            
            inDegree[prerequisites[i][0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        int res=0;
        int[] result = new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(inDegree[i]==0) {q.add(i);}
        }
        
        if(numCourses>0 && q.size()==0) return new int[0];
        
        while(!q.isEmpty())
        {
            int currNode = q.poll();
            result[res]=currNode;
            res++;
            ArrayList<Integer> currAdj = adj.get(currNode);
            for(int adjNode: currAdj)
            {
                inDegree[adjNode]--;
                if(inDegree[adjNode]==0) q.add(adjNode);
            }
        }
        if(res<numCourses) return new int[0];
        return result;
                
     
    }
}