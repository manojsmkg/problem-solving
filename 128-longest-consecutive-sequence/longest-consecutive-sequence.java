class Solution {
    public int longestConsecutive(int[] nums) 
    {
        Set<Integer> numSet = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            numSet.add(nums[i]);
        }

        int maxLen = 0;
        for(int num : numSet)
        {
            int currNum = num;
            int currLen = 0;
            if(numSet.contains(currNum-1) == false){
            while(numSet.contains(currNum))
            {
                currNum++;
                currLen++;
                maxLen = Math.max(maxLen,currLen);
            }
            }
        }
        return maxLen;
    }
}