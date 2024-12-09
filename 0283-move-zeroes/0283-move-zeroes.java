class Solution {
    
    public void moveZeroes(int[] nums) 
    {
        int n = nums.length,nZ=-1,k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0) {if(nZ==-1) nZ = i;k++;}
        }
        if(nZ == -1) return ;
        
        int i=0;
        while(i<k)
        {
            nums[i] = nums[nZ];
            nZ++;
            while(nZ<n && nums[nZ]==0) nZ++;
            i++;
        }
        for(i=k;i<n;i++) nums[i]=0;
    }
}