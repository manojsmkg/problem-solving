class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int gmax = Integer.MIN_VALUE;
        Queue<Integer> q= new LinkedList();
        int productSoFar = 1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0) {
                q.add(productSoFar);
                productSoFar = 1;
                if(i==n-1) q.add(0);
            }
            else
            {
                productSoFar = productSoFar * nums[i];
                if(i==n-1) q.add(productSoFar);
            }
        }
        
        int subProduct = q.poll();
        productSoFar = 1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                subProduct = q.poll();
                productSoFar = 1;
                gmax = Math.max(gmax,0);
            }
            else
            {
                int maxPossibleSubProduct = subProduct / productSoFar;
                productSoFar = productSoFar * nums[i];
                gmax = Math.max(maxPossibleSubProduct, gmax);
                gmax = Math.max(productSoFar, gmax);
            }
        }
        return gmax;       
    }
}