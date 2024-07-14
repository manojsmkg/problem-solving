class Solution {
    
    public int coinChangeUtil(int[] coins,int amount,int count,int[] dp)
    {
        if(amount<=0) return 100000;
        for(int i=0;i<coins.length;i++)
            if(coins[i]==amount) return count;
        if(dp[amount]!=-1) return dp[amount];
        int minC = 100000;
        for(int i=0;i<coins.length;i++)
        {
            if(coins[i]<=amount)
            minC = Math.min(minC,coinChangeUtil(coins,amount-coins[i],count,dp)+1);
        }
        dp[amount]=minC;
        return minC;
    }
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int dp[] = new int[amount+1];
        for(int i=0;i<=amount;i++) dp[i]=-1;
        int res =coinChangeUtil(coins,amount,0,dp); 
        return res>=100000?-1:res+1;
        
    }
}