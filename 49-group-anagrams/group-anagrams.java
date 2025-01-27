class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        int n = strs.length;
        Map<String,List<String>> groups = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int[] count = new int[26];
            for(char c : strs[i].toCharArray())
            {
                count[c-'a']++;
            }
            String key = "";
            for(int j=0;j<26;j++)
            {
                key+=count[j]+"#";
            }
            if(!groups.containsKey(key))
                groups.put(key,new ArrayList<String>());
            groups.get(key).add(strs[i]);
        }
        
        List<List<String>> result = new ArrayList<>();
        for(String key : groups.keySet())
        {
            result.add(groups.get(key));
        }
        return result;

    }
}