class Solution {
    
public:
    int climbStairs(int n) {
        if(n<=3) return n;

        int result[n+1];
        for(int i=0;i<n+1;i++) result[i]=0;
        result[1]=1;
        result[2]=2;
        for(int i=3;i<n+1;i++)
        {
            result[i] = result[i-1]+result[i-2];
            
        }
        return result[n];
     
    }
};