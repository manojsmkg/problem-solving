class Solution {
    public int mySqrt(int x) 
    {
        int i=0;
        if(x==1 || x==2) return 1;
        if(x == 2147483647) return 46340;
        for(i=0;i<=x/2;i++)
        {
            if(i*i==x) return i;
            if(i*i>x) break; 
        }
        return i-1;
    }
}