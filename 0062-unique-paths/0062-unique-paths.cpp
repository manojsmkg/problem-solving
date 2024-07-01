class Solution {
public:
    
    int countPaths(int currX,int currY,int m,int n,vector<vector<int>>& dp)
    {
        if(currX==m-1 & currY == n-1) return 1;
        else if(currX>=m || currY >=n) return 0;
        else if(dp[currX][currY]!=-1) return dp[currX][currY];
        else return dp[currX][currY]=countPaths(currX+1,currY,m,n,dp) + countPaths(currX,currY+1,m,n,dp);
    }
    int uniquePaths(int m, int n) {
        vector<vector<int>> dp(m+1,vector<int>(n+1,-1));
        int num = countPaths(0,0,m,n,dp);
        if(m==1 & n==1) return num;
        return dp[0][0];
    }
};