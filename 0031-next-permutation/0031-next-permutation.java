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
    
    public void nextPermutation(int[] nums) {
        int i;
        for(i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1]) break;
        }
        if(i==-1) { reverseArr(nums,0,nums.length-1);return;
                  }
        int swapElement = i;
        for(int j=nums.length-1;j>i;j--)
        {
            if(nums[j] > nums[i]) {swapElement = j;break;}
        }
        int temp = nums[i];
        nums[i] = nums[swapElement];
        nums[swapElement] = temp;
        reverseArr(nums,i+1,nums.length-1);
        return;
    }
}