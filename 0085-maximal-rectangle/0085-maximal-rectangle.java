class Solution {
    
    public int maxArea(int[] histogram,int n)
    {
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(st.isEmpty() == false && histogram[i]<=histogram[st.peek()]) st.pop();
            if(st.isEmpty() == true) pse[i] = 0;
            else pse[i] = st.peek()+1;
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(st.isEmpty() == false && histogram[i]<=histogram[st.peek()]) st.pop();
            if(st.isEmpty() == true) nse[i] = n-1;
            else nse[i] = st.peek()-1;
            st.push(i);
        }
        int maxArea = 0;
        for(int i=0;i<n;i++)
        {
           if(i==0) System.out.println(histogram[i]+ " " + nse[i]+" " + pse[i]);
            maxArea = Math.max(histogram[i] * (nse[i]-pse[i]+1),maxArea);
        }
        //System.out.println(maxArea);
        return maxArea;
    }
    
    public int maximalRectangle(char[][] matrix) 
    {
        int m=matrix.length,n=matrix[0].length;
       // if(m==1 && n==1 && matrix[0][0] == '1') return 1;
        int[] histogram = new int[n];
        int gmaxArea = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]=='1') histogram[j]++;
                else histogram[j]=0;
            }
            gmaxArea = Math.max(gmaxArea,maxArea(histogram,n));
            
        }
        return gmaxArea;
        
    }
}