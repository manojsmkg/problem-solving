class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int[] result = new int[2];
        HashMap<Integer,Integer> sum = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(sum.containsKey(target-nums[i])) {
                result[0] = sum.get(target-nums[i]);
                result[1] = i;
                return result;
            }
            sum.put(nums[i],i);
        }
            return result;
        
    }
}