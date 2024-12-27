class Node
{
    int num;
    int ind;
    Node(int num,int ind)
    {
        this.num = num;
        this.ind = ind;
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        if(k>nums.length) return null;
        int n=nums.length;
        int resN = n-k+1;
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->b.num - a.num);
        for(int i=n-1;i>=resN;i--)
        {
            pq.add(new Node(nums[i],i));
        }
        
        int[] result = new int[resN];
        
        for(int i=resN-1;i>=0;i--)
        {
            pq.add(new Node(nums[i],i));
            while(pq.peek().ind>i+k-1) pq.remove();
            result[i] = pq.peek().num;
        }
        return result;      
    }
}