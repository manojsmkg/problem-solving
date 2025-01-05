class Solution {
    
    boolean isPalindrome(String s)
    {
        int left = 0, right = s.length()-1;
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right)) return false;
            right--;
            left++;
        }
        return true;
    }
    
    public void partitionUtil(String s,int n,List<List<String>> result,int ind,List<String> currList)
    {
        if(ind==n) 
        {
            result.add(new ArrayList(currList));
        }


        for(int i=ind;i<n;i++)
        {
            if(isPalindrome(s.substring(ind,i+1)))
            {
                currList.add(s.substring(ind,i+1));
                partitionUtil(s,n,result,i+1,currList);
                currList.remove(currList.size()-1);
            }
        }

    }
    
    public List<List<String>> partition(String s) 
    {
        List<List<String>> result = new ArrayList<>();
        partitionUtil(s,s.length(),result,0,new ArrayList<String>());
        return result;
    }
}