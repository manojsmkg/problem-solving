
class Solution {
    class Node{
        int x;
        int y;
        int effort;
        Node(int x1,int y1, int effort1) 
        {
           x=x1;y=y1;effort=effort1;
        }
    }
    public int minimumEffortPath(int[][] height) {
        int rows=height.length;
        int cols=height[0].length;
        
        int[][] effort = new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                effort[i][j]=Integer.MAX_VALUE;
        
        PriorityQueue<Node> pq= new PriorityQueue<>((x,y)->x.effort-y.effort);
    
        effort[0][0]=0;
        pq.add(new Node(0,0,0));
        
        Node currNodes = pq.peek();
        System.out.println(currNodes.x+" "+currNodes.y+" "+currNodes.effort);
        System.out.println("entering loop now");
        
        while(!pq.isEmpty())
        {
            Node currNode = pq.peek();
            pq.remove();
            
            int i=currNode.x;
            int j=currNode.y;
            int currEffort = currNode.effort;
            System.out.println(i+" "+j+" "+currEffort);
            
            if(i-1>=0 && Math.max(Math.abs(height[i][j]-height[i-1][j]),currNode.effort)<effort[i-1][j])
            {
                effort[i-1][j]=Math.max(Math.abs(height[i][j]-height[i-1][j]),currNode.effort);
                pq.add(new Node(i-1,j,effort[i-1][j]));
            }
            if(i+1<rows && Math.max(Math.abs(height[i][j]-height[i+1][j]),currNode.effort)<effort[i+1][j])
            {
                effort[i+1][j]=Math.max(Math.abs(height[i][j]-height[i+1][j]),currNode.effort);
                pq.add(new Node(i+1,j,effort[i+1][j]));
            }
            if(j-1>=0 && Math.max(Math.abs(height[i][j]-height[i][j-1]),currNode.effort)<effort[i][j-1])
            {
                effort[i][j-1]=Math.max(Math.abs(height[i][j]-height[i][j-1]),currNode.effort);
                pq.add(new Node(i,j-1,effort[i][j-1]));
            }
            if(j+1<cols && Math.max(Math.abs(height[i][j]-height[i][j+1]),currNode.effort)<effort[i][j+1])
            {
                effort[i][j+1]=Math.max(Math.abs(height[i][j]-height[i][j+1]),currNode.effort);
                pq.add(new Node(i,j+1,effort[i][j+1]));
            }
        }
        /*
        
    
    
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(i==0 && j==0) continue;
                
                int right=Integer.MAX_VALUE,left=Integer.MAX_VALUE,down=Integer.MAX_VALUE,up=Integer.MAX_VALUE;
                if(i-1>=0 && effort[i-1][j]!=Integer.MIN_VALUE)
                {
                    up=Math.max(Math.abs(height[i][j]-height[i-1][j]),effort[i-1][j]);
                }
                if(i+1<rows && effort[i+1][j]!=Integer.MIN_VALUE)
                {
                    down=Math.max(Math.abs(height[i][j]-height[i+1][j]),effort[i+1][j]);
                }
                if(j-1>=0 && effort[i][j-1]!=Integer.MIN_VALUE)
                {
                    left=Math.max(Math.abs(height[i][j]-height[i][j-1]),effort[i][j-1]);
                }
                if(j+1<cols && effort[i][j+1]!=Integer.MIN_VALUE)
                {
                    right=Math.max(Math.abs(height[i][j]-height[i][j+1]),effort[i][j+1]);
                }
                effort[i][j]=Math.min(up,Math.min(down,Math.min(left,right)));

            }
            
        }*/
        return effort[rows-1][cols-1];
        
    }
}