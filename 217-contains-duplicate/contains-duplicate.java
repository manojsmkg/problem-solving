class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        Map<Integer,Integer> ctMap = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(ctMap.containsKey(nums[i])) return true;
            ctMap.put(nums[i],0);
        }
        return false;
    }
}