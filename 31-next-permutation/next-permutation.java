class Solution {

    public void reverse(int[] nums,int start, int end)
    {   
        while(start<end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int breakingPt = -1;

        for(int i=n-2;i>=0;i--)
        {
            if(nums[i+1]>nums[i])
                {
                    breakingPt = i;
                    break;
                }
        }


        if(breakingPt==-1) {
            reverse(nums,0,n-1);
            return;
        }

        int indToReplace = breakingPt+1;
        
        for(int i=breakingPt+1;i<n;i++)
            {
                if(nums[i]>nums[breakingPt]) indToReplace = i;
            }

        int temp = nums[indToReplace];
        nums[indToReplace] = nums[breakingPt];
        nums[breakingPt] = temp;

        reverse(nums,breakingPt+1,n-1);

    }
}