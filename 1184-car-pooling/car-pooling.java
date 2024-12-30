class Node
{
    int ind;
    int pass;
    Node(int ind,int pass)
    {
        this.ind = ind;
        this.pass = pass;
    }
    public String toString()
    {
        return ind + " " + pass;
    }
}

class Solution {
    public boolean carPooling(int[][] trips, int capacity) 
    {
        int n = trips.length;
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->
        {
            if(a.ind==b.ind) return a.pass-b.pass;
            return a.ind - b.ind;
        });
        for(int i=0;i<n;i++)
        {
            pq.add(new Node(trips[i][1],trips[i][0]));
            pq.add(new Node(trips[i][2],trips[i][0] * -1));
          
        }
        
        int currCapacity = 0;

        while(pq.isEmpty()==false)
        {
            Node currNode = pq.poll();
            currCapacity += currNode.pass; 
            if(currCapacity > capacity) return false;
        }

return true;
        
    }
}