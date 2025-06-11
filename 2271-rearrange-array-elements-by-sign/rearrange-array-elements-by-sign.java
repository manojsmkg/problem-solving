class Solution {
    private void rightShift(int[] nums, int start, int end)
    {
        int temp = nums[end];
        int prev = nums[start];
        for(int i=start+1;i<=end;i++)
        {
            int loc = nums[i];
            nums[i] = prev;
            prev=loc;
        }
        nums[start] = temp;
    }
    public int[] rearrangeArray(int[] nums) 
    {

        int pos =0;
        int neg =1;
        int n=nums.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0) 
            {
                ans[pos] = nums[i];
                pos+=2;
            }
            else {
                ans[neg] = nums[i];
                neg+=2;
            }
        }
        return ans;
        /*int pos=0;
        int neg=1;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                if(nums[i]<0)
                {
                    int t=i;
                    while(t<n && nums[t]<0) t++;
                    if(t<n) rightShift(nums,i,t);
                }
                pos+=2;                    
            }
            else
            {
                if(nums[i]>0)
                {
                    int t=i;
                    while(t<n && nums[t]>0) t++;
                    if(t<n) rightShift(nums,i,t);
                }
                neg+=2;
            }
        }
        return nums;*/
    }
}