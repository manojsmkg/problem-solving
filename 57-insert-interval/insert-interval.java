class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) 
    {
        int n = intervals.length;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->a[0]-b[0]);
        for(int i=0;i<n;i++)
        {
            pq.add(intervals[i]);
        }
        pq.add(newInterval);
        int start = pq.peek()[0]; 
        int end = pq.peek()[1]; 
     //   pq.poll();
        List<int[]> result = new ArrayList<>();
        while(pq.isEmpty()==false)
        {
            int[] currInterval = pq.poll();
            if(currInterval[0]<=end) 
            {
                end = Math.max(end,currInterval[1]);
            }
            else 
            {
                int[] mergedInterval = {start,end};
                result.add(mergedInterval);
                start = currInterval[0];
                end = currInterval[1];
            }
        }
        
            int[] mergedInterval = {start,end};
            result.add(mergedInterval);
        int[][] resultArr = new int[result.size()][2];
        for(int i=0;i<result.size();i++)
        {

            resultArr[i][0] = result.get(i)[0];
            resultArr[i][1] = result.get(i)[1];
        }
        return resultArr;
    }
}