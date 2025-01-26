class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int productSoFar = 1;
        int[] productFromRight = new int[n];
        int prod = 1;
        for(int i=n-1;i>=0;i--)
        {
            productFromRight[i] = prod;
            prod = prod*nums[i];
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++)
        {
            res[i] = productSoFar * productFromRight[i];
            productSoFar = productSoFar * nums[i];
        }
        return res;
    }
}