class Solution {
    public int maxArea(int[] height) 
    {
       int n=height.length;
       if(n<=1) return 0;
       int l = 0;
       int r = n-1;
       int maxArea = 0;

       while(l<r)
       {
        int minH = Math.min(height[l],height[r]);
        maxArea = Math.max(minH*(r-l),maxArea);
        if(minH==height[l]) l++;
        else r--;
       }
       return maxArea;
    }
} 