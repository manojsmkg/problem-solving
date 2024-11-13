class iPair{
    int first;
    int second;
    public iPair(int first,int second)
    {
        this.first = first;
        this.second = second;
    }
}

class Node{
    int distance;
    int node;
    int steps;
    public Node(int distance,int node,int steps)
    {
        this.distance = distance;
        this.node = node;
        this.steps = steps;
    }
}
class Solution {
    
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) 
    {
        List<List<iPair>> adj = new ArrayList<>();
        int[] distance = new int[n];
        for(int i=0;i<n;i++) 
        {
            adj.add(new ArrayList());
            distance[i]=Integer.MAX_VALUE;
        }
        
        
        for(int i=0;i<flights.length;i++)
        {
            List<iPair> curr = adj.get(flights[i][0]);
            curr.add(new iPair(flights[i][1],flights[i][2]));
        }
        
        PriorityQueue<Node> pq = new PriorityQueue<Node>( new Comparator<Node>() {
            @Override
            public int compare(Node n1,Node n2)
            {
                return Integer.compare(n1.steps,n2.steps);
            }
        });
        
        pq.add(new Node(0,src,0));
        distance[src]=0;
        
        while(pq.isEmpty() == false)
        {
            Node currNode = pq.poll();
            List<iPair> currAdj =  adj.get(currNode.node);
            if(currNode.steps > k) break;
            for(iPair p : currAdj)
            {
                if(distance[p.first] > currNode.distance + p.second )
                {
                    distance[p.first] = currNode.distance + p.second;
                    pq.add(new Node(currNode.distance+p.second,p.first,currNode.steps+1));
                }
            }       
        }
        return distance[dst]==Integer.MAX_VALUE?-1:distance[dst];
     }
}