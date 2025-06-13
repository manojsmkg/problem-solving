class Solution {
    public int[] replaceElements(int[] arr) {

        int n = arr.length;

        int greatestSoFar = -1;

        for(int i=n-1;i>=0;i--)
        {
            int temp = greatestSoFar;
            greatestSoFar = Math.max(arr[i],greatestSoFar);
            arr[i] = temp;
        }

        return arr;
        
    }
}