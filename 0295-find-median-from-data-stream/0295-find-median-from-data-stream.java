class MedianFinder {
    
    int count ;
    PriorityQueue<Integer> minQueue;
    PriorityQueue<Integer> maxQueue; 
    public MedianFinder() {
        minQueue = new PriorityQueue<Integer>((a,b)->a-b);
        maxQueue = new PriorityQueue<Integer>((a,b)->b-a);
        count = 0; 
    }
    
    public void addNum(int x) {
       if(maxQueue.size() == 0 || maxQueue.peek()>=x) maxQueue.offer(x);
        else minQueue.offer(x);
        
         if (maxQueue.size() > minQueue.size() + 1) {
            minQueue.add(maxQueue.poll());
        } else if (minQueue.size() > maxQueue.size()) {
            maxQueue.add(minQueue.poll());
        }
        count++;
    }
    
    public double findMedian() {
        
        if(count%2==0) return (double) (minQueue.peek() + maxQueue.peek()) / 2;
       else return (double) maxQueue.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */