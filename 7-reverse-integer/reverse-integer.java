class Solution {
    public int reverse(int x) 
    {
      Stack<Integer> st = new Stack<>();
      int t=10;
      long newNum=0,multiPlier = 1;;
      int isNeg=0;
      if(x<0) isNeg=1;
      x=Math.abs(x);

      while(x>0)
      {
        int n=x%t;
        x=x/t;
        st.push(n);
      }  

      while(st.isEmpty()==false)
      {
        int curr = st.pop();
        newNum += curr*multiPlier;
        multiPlier*=10;
      }

      if(newNum>Integer.MAX_VALUE) return 0;
      if(isNeg==1) newNum*=-1;
      
      return (int) newNum;
    }
}