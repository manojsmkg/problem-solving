class NumArray {

    int sumArray[] ;
    int len = 0;

    public NumArray(int[] nums) {
        len = nums.length;
        int sum = 0;
        sumArray = new int[len];
        for(int i=0;i<len;i++)
        {
            sum+=nums[i];
            sumArray[i] = sum;
            System.out.println(sumArray[i]);
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return sumArray[right];
        else return sumArray[right]-sumArray[left-1]; 
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */