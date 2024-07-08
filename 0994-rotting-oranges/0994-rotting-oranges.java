class Solution {
    public int orangesRotting(int[][] a) {
        int count=0;
        
        Queue<ArrayList<Integer>> q = new LinkedList();
        
        int rows=a.length;
        int columns=a[0].length;
        int freshOranges=0;
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(a[i][j] == 2)
                {
                    q.add(new ArrayList<>(Arrays.asList(i,j)));
                }
                if(a[i][j]==1) freshOranges++;
            }
        }
        if(q.isEmpty() && freshOranges>0) return -1;
        if(freshOranges==0) return 0;
        freshOranges=freshOranges+q.size();
        while(!q.isEmpty())
        {
            int k=q.size();
            while(k>0)
            {
                ArrayList<Integer> currIndices = q.poll();
                k--;
                freshOranges--;
                int i=currIndices.get(0),j=currIndices.get(1);
                if(i-1>=0 && a[i-1][j]==1) {a[i-1][j]=2;q.add(new ArrayList<>(Arrays.asList(i-1,j)));}
                if(i+1<rows && a[i+1][j]==1) {a[i+1][j]=2;q.add(new ArrayList<>(Arrays.asList(i+1,j)));}
                if(j-1>=0 && a[i][j-1]==1) {a[i][j-1]=2;q.add(new ArrayList<>(Arrays.asList(i,j-1)));}
                if(j+1<columns && a[i][j+1]==1) {a[i][j+1]=2;q.add(new ArrayList<>(Arrays.asList(i,j+1)));}
            }
            count++;
        }
        if(freshOranges==0) return count-1;
        return -1;
        
        
        
    }
}