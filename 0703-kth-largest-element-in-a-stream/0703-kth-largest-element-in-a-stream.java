class KthLargest {
    
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    Set<Integer> s = new HashSet<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i=0;i<nums.length;i++){
            this.addUtil(nums[i]);
        }
    }
    
    public void addUtil(int val)
    {
        if(s.contains(val)) return;
        pq.offer(val);
        pop();
    }
    public void pop()
    {
        while(pq.size()>k) pq.remove();
    }
    
    public int add(int val) {
        this.addUtil(val);
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */