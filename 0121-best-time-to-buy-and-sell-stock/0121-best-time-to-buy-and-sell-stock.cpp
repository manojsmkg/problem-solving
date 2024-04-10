class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        int greatestSoFar=prices[n-1];
        int maxProfit = 0;
        for(int i=n-2;i>=0;i--)
        {
            if(prices[i]>greatestSoFar)
                greatestSoFar = prices[i];
            
            maxProfit = max(maxProfit,greatestSoFar-prices[i]);
        }

        return maxProfit;
  
    }
};