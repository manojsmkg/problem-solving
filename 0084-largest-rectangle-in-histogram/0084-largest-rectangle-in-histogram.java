class Solution {
    public int largestRectangleArea(int[] heights) 
    {
        int n = heights.length;
        if(n==1) return heights[0];
        int[] leftSmaller = new int[n];
        int[] rightSmaller = new int[n];
        
        Stack<Integer> leftSmall = new Stack<Integer>();
        Stack<Integer> rightSmall = new Stack<Integer>();

        for(int i=0;i<n;i++)
        {
            while(leftSmall.isEmpty()==false && heights[leftSmall.peek()]>=heights[i]) leftSmall.pop();
            if(leftSmall.isEmpty() == true) leftSmaller[i]=0;
            else leftSmaller[i] = leftSmall.peek() + 1;
            leftSmall.push(i);
        }
        for(int i=0;i<n;i++) System.out.print(leftSmaller[i]+ " ");
        System.out.println(" ");
        
        for(int i=n-1;i>=0;i--)
        {
            while(rightSmall.isEmpty() == false && heights[rightSmall.peek()]>=heights[i]) rightSmall.pop();
            if(rightSmall.isEmpty() == true) rightSmaller[i] = n-1;
            else rightSmaller[i] = rightSmall.peek()-1;
            rightSmall.push(i);
        }
        int maxArea = 0;
        for(int i=0;i<n;i++)
        {
            //if(n<=2) maxArea = Math.max(maxArea,((rightSmaller[i]-leftSmaller[i])*heights[i]));
             maxArea = Math.max(maxArea,((rightSmaller[i]-leftSmaller[i]+1)*heights[i]));
        }

        return maxArea;
        
    }
}