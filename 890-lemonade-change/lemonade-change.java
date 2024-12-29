class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
        Map<Integer,Integer> countMap = new HashMap<Integer,Integer>();
        countMap.put(5,0);
        countMap.put(10,0);
        countMap.put(20,0);
        int n = bills.length;
        for(int i=0;i<n;i++)
        {
            countMap.put(bills[i],countMap.get(bills[i])+1);
            //System.out.println(countMap);
            if(bills[i] == 5) continue;
            else if(bills[i] == 10) 
            {
                if(countMap.containsKey(5) && countMap.get(5) == 0) return false;
                countMap.put(5,countMap.get(5)-1);
             }
             else if(bills[i]== 20)
             {
                if( countMap.get(5)>0 && countMap.get(10) > 0) 
                    {
                    countMap.put(10,countMap.get(10)-1);
                    countMap.put(5,countMap.get(5)-1);
                    }
                
              else if(countMap.get(5)>=3) {countMap.put(5,countMap.get(5)-3);}

                
                else return false;
               }
        }
        return true;
        
    }
}