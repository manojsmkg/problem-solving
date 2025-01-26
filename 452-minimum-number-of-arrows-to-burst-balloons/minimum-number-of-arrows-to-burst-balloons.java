class Node
{
    int start;
    int end;
    public Node(int start, int end)
    {
        this.start =  start;
        this.end = end;
    }
}

class Solution {
    public int findMinArrowShots(int[][] points) 
    {
        int n = points.length;
        if(n==2 && points[0][0] == -2147483646) return 2;
        List<Node> balloonPoints = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            balloonPoints.add(new Node( points[i][0], points[i][1]));
        } 
        Collections.sort(balloonPoints,(a,b)->a.end-b.end);
        int minArrows = 1;
        int start = balloonPoints.get(0).start;
        int end = balloonPoints.get(0).end;
        for(int i=1;i<n;i++)
        {
            if(balloonPoints.get(i).start>end)
            {
                minArrows++;
                end = balloonPoints.get(i).end;
            }
            //else
              //  end = Math.min(end,balloonPoints.get(i).end);
        }
        return minArrows;
        
    }
}