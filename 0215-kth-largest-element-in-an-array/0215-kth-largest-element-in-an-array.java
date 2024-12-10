class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int n = nums.length;
        k=n-k+1;
        for(int i=0;i<nums.length;i++)
        {
            pq.offer(nums[i]);
            if(pq.size()>k) pq.poll();
        }
        return pq.peek();
    }
}