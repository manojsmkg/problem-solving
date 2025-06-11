class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0;
        int n = prices.length;
        int greatestSoFar = prices[n-1];
        for(int i=n-2;i>=0;i--)
        {
            maxProfit = Math.max(greatestSoFar-prices[i],maxProfit);
            greatestSoFar = Math.max(prices[i],greatestSoFar);
        }
        return maxProfit;
        
    }
}