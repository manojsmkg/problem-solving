class Solution {

    private void swapUtil(int[] nums,int a,int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int i = 0;


        while(i<=right && left<=right)
        {
            if(nums[i]==2)
                {
                    swapUtil(nums,i,right);
                    right--;
                }
            else if(nums[i]==0)
            {
                swapUtil(nums,left,i);
                left++;
                i++;
            }
            else i++;
        }
        
    }
}