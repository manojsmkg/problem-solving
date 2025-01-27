class Solution {
    public int helperSum(int n)
    {
        int result = 0;
        while(n>0)
        {
            int temp = n%10;
            n=n/10;
            result = result + temp*temp;
        }
        return result;
    }

    public boolean isHappy(int n) 
    {
        int slow = n;
        int fast = n;
        do
        {
            slow = helperSum(slow);
            fast = helperSum(helperSum(fast));
        }while(slow!=fast);

       return slow==1;
    }
}