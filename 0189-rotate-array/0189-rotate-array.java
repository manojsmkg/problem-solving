class Solution {
    public void reverseArr(int[] nums,int start,int end)
    {
        while(start<=end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        int temp = nums[0];
        reverseArr(nums,n-k%n,n-1);
        reverseArr(nums,0,n-k%n-1);
        reverseArr(nums,0,n-1);
    }
}