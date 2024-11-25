class Solution {
    
    
    
    public void merge(int l, int r,int[] nums)
    {
        int mid = (l+r) / 2;
        int n = (r-l) + 1;
        int[] temp = new int[n];
        
        int lh = l; int rh = mid+1;
        int i=0;
        while(lh<=mid && rh <= r)
        {
            if(nums[lh] < nums[rh]) 
            {
                temp[i] = nums[lh];
                lh++;
            }
            else
            {
                //if(nums[lh] > 2 * nums[rh]) count[0] = count[0]+1;
                temp[i] = nums[rh++];
            }
                
            i++;
        }
        
        while(lh<=mid)
            temp[i++] = nums[lh++];
        
        while(rh<=r)
            temp[i++] = nums[rh++];
        
        
        for( i=l;i<=r;i++)
        {
            nums[i] = temp[i-l];
        }
        
        
    }
    
    public int  countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            long currRight = Integer.MAX_VALUE;
            if(right<=high) currRight = arr[right];
            long currLeft = arr[i];
            while (right <= high && currLeft > 2 * currRight) 
            {   
                right++;
                if(right<=high) currRight = arr[right];
            }
            cnt += (right - (mid + 1));
        }
        return cnt;
    }
    
    public int countReverse(int l,int r,int n,int[] nums)
    {
        if(l>=r) return 0;
        
        int mid = (l+r) / 2;
        
        int ct = countReverse(l,mid,n,nums);
        ct+=countReverse(mid+1,r,n,nums);
        ct+=countPairs(nums,l,mid,r);
        merge(l,r,nums);
        return ct;
        
    }
    
    public int reversePairs(int[] nums) {
        
        return countReverse(0,nums.length-1,nums.length,nums);
    }
}