class Solution {
    public int maxProfit(int[] prices) 
    {
        int profit = 0;
        int n = prices.length;
        int greatestSoFar = prices[n-1];

        for(int i=n-1;i>=0;i--)
        {
            if(profit < greatestSoFar - prices[i]) profit = greatestSoFar - prices[i];
            greatestSoFar = Math.max(greatestSoFar,prices[i]);
        }
        return profit;
    }
}