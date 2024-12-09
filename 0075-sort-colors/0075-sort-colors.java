class Solution {
    void swap(int[] nums,int i,int j)
    {
       int temp = nums[i];
       nums[i] = nums[j];
       nums[j] = temp;
    }
    public void sortColors(int[] nums) 
    {
        int low = 0,n=nums.length;
        int high = n-1;
        int mid=0;
        
        while(mid<=high)
        {
            if(nums[mid] == 2) 
            {
                swap(nums,mid,high);
                high--;
            }
             else if(nums[mid] == 1) 
            {
               mid++;
            }
            else if(nums[mid] == 0 )
            {
                swap(nums,mid,low);
                low++;
                mid++;
            }
           
          
        }
        
    }
}