class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        HashMap<Integer,Integer> ctMap = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(ctMap.containsKey(nums[i]) && i-ctMap.get(nums[i]) <= k) return true;
            ctMap.put(nums[i],i);
        }
        return false;
    }
}