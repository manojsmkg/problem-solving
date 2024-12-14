class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] rightGreater = new int[n];
        int[] leftGreater = new int[n];
        int maxFromRight = -1;
        int maxFromLeft = -1;
        for(int i=0;i<n;i++)
        {
            rightGreater[n-i-1] = maxFromRight;
            maxFromRight = Math.max(maxFromRight,height[n-i-1]);
            leftGreater[i] = maxFromLeft;
            maxFromLeft = Math.max(maxFromLeft,height[i]);
        }
        for(int i=0;i<n;i++)
        {
           System.out.println(rightGreater[i]);
        }
        for(int i=0;i<n;i++)
        {
           System.out.println(leftGreater[i]);
        }
        
        
        int result = 0;
        for(int i=0;i<n;i++)
        {
            int currWater = Math.min(leftGreater[i],rightGreater[i]) - height[i];
            if(currWater > 0) result += currWater;
        }
        return result;
    }
}