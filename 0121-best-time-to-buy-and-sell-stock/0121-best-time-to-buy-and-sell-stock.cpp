class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        vector<int> greatest;
        int greatestSoFar=prices[n-1];
        greatest.push_back(greatestSoFar);
        for(int i=n-2;i>=0;i--)
        {
            if(prices[i]>greatestSoFar)
                greatestSoFar = prices[i];
            greatest.push_back(greatestSoFar);
        }
        reverse(greatest.begin(),greatest.end());
        int maxProfit = 0;
        for(int i=0;i<n;i++)
        {
            maxProfit = max(maxProfit,greatest[i]-prices[i]);
        }
        return maxProfit;
  
    }
};