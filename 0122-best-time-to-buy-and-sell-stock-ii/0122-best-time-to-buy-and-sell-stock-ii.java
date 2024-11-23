class Solution {
    public int maxProfitUtil(int[] prices, int i,int buySell,int n,int[][] dp)
    {
        if(i==n) return dp[i][buySell] = 0;
        if(dp[i][buySell] != -1 ) return dp[i][buySell];
        
        int profit = 0;
        
        if(buySell == 0)
        {
             return dp[i][buySell] = Math.max(
                 prices[i] + maxProfitUtil(prices,i+1 , 1, n,dp),
                              maxProfitUtil(prices,i+1,0,n,dp)
             );
        }
        else
            return dp[i][buySell] = Math.max(- prices[i] + maxProfitUtil(prices,i+1  , 0 , n,dp),
                            maxProfitUtil(prices,i+1,1,n,dp)
                           );
    }
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length+1][2];
        for(int i=0;i<=prices.length;i++)
        { 
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
       // return 
        maxProfitUtil(prices,0,1,prices.length,dp);
        
        return dp[0][1];
    }
}