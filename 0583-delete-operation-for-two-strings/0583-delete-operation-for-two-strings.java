class Solution {
    public int minDistance(String word1, String word2) 
    {
        int m = word1.length();
        int n = word2.length();
        
        int[] curr = new int[n+1];
        int[] prev = new int[n+1];
            
        for(int i = 1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    curr[j] = prev[j-1] + 1;
                else
                    curr[j] = Math.max(prev[j]  , curr[j-1]);
            }
            prev = curr.clone();
        }
        
        return m - prev[n] + n - prev[n];
        
    }
}