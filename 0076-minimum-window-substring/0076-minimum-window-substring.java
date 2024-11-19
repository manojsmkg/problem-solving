class Solution {
    public String minWindow(String s, String t) 
    {
        Map<Character,Integer> minMap = new HashMap<>();
        
        int m = s.length();
        int n = t.length();
        
        for(int i=0;i<n;i++)
        {
            if(minMap.containsKey(t.charAt(i)))
                minMap.put(t.charAt(i),minMap.get(t.charAt(i))-1);
            else
                minMap.put(t.charAt(i),-1);
        }
        
        
        int start = 0, end = 0 , ct = minMap.size();
        int minStart = 0, minEnd = 0 , currCt = 0;
        String res = "";

        while(end<=m && start<=end)
        {            
            while(currCt == ct && start<end)
            {
                minStart = start;
                minEnd = end;
                if(minEnd - minStart < res.length() || res.length() == 0) res = s.substring(minStart,minEnd);
                if(minMap.get(s.charAt(start)) == 0) currCt--;
                minMap.put(s.charAt(start),minMap.get(s.charAt(start))-1);
                start++;
            }
            if(end >= m) break;
            if(minMap.containsKey(s.charAt(end)))
            {
                minMap.put(s.charAt(end) , minMap.get(s.charAt(end)) + 1);
                if(minMap.get(s.charAt(end)) == 0) currCt++;
            }
            else minMap.put(s.charAt(end), 1);
            end++;
        }
        return res;
        
            
    }
}