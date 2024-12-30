//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;

    Job(int x, int y, int z) {
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

class GfG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] jobIDStrings = sc.nextLine().split(" ");
            String[] deadlineStrings = sc.nextLine().split(" ");
            String[] profitStrings = sc.nextLine().split(" ");

            // Convert the input strings to integer arrays
            int[] jobIDs = new int[jobIDStrings.length];
            int[] deadlines = new int[deadlineStrings.length];
            int[] profits = new int[profitStrings.length];

            for (int i = 0; i < jobIDStrings.length; i++) {
                jobIDs[i] = Integer.parseInt(jobIDStrings[i]);
                deadlines[i] = Integer.parseInt(deadlineStrings[i]);
                profits[i] = Integer.parseInt(profitStrings[i]);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.JobSequencing(jobIDs, deadlines, profits);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/*class NewJob
{
    int id;
    int deadline;
    int profit;
    NewJob(int id,int deadline,int profit)
    {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
    public String toString()
    {
        return this.id + " " + this.deadline + " " + this.profit;
    }
}
*/

class Solution {

    public ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {
    
        int n=id.length;
        int[] arr = new int[n+1];
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Job> pq = new PriorityQueue<>((a,b)->
        {
            //if(a.deadline == b.deadline) 
            if(a.profit == b.profit) return a.deadline - b.deadline;
            return b.profit-a.profit;
        }
        );
        
        for(int i=0;i<n;i++)
        {
            pq.add(new Job(id[i],deadline[i],profit[i]));
        }
        
        int currProfit = 0,jobs = 0;
        int prevDeadline = 0;
        int currTime = 0;
       // System.out.println(pq);
        while(pq.isEmpty() == false)
        {
         /*   if(pq.peek().deadline <= currTime) 
            {
                pq.poll();
                continue;
            }
            */
            Job currJob = pq.poll();
            int j=currJob.deadline;
            while(j>=1 && arr[j]!=0) j--;
            arr[j]=currJob.profit;
        }
        for(int i=1;i<=n;i++)
        {
           // System.out.println(arr[i]);
            if(arr[i]!=0) jobs++;
            currProfit += arr[i];
        }
        result.add(jobs);
        result.add(currProfit);
        return result;
        
        
    }
}
