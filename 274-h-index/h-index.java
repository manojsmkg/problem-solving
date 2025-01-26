class Solution {
    public int hIndex(int[] citations) 
    {
        int n = citations.length;
        if(n==1 && citations[0]==0) return 0; 
        Arrays.sort(citations);
        int res = 0;
        for(int i=n-1;i>=0;i--)
        {
            if(citations[i]!=0 && citations[i]>=(n-i))
                res = n-i;
           
        }
        return res;
    }
}