class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] result = new int[2];
        int n = numbers.length;

        int i=0,j=n-1;
        while(i<j)
        {
            int currSum = numbers[i]+numbers[j];
            if(currSum == target)
            {
                result[0] = i+1;
                result[1] = j+1;
                break;
            }
            else if (currSum>target) j--;
            else i++;
        }
        return result;
    }
}