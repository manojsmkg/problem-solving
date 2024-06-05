class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        int greatestSoFar = prices[n-1];
        int maxProfit=INT_MIN;
        for(int i=n-1;i>=0;i--)
        {
            int currProfit = greatestSoFar - prices[i];
            maxProfit = max(currProfit,maxProfit);
            greatestSoFar = max(greatestSoFar,prices[i]);
        }
        return maxProfit;
    }
};