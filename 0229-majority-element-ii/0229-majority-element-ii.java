class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        int ct1=0,ct2=0,el1=0,el2=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(ct1 == 0 && nums[i]!=el2) {el1=nums[i];ct1++;}
            
            else if(ct2==0 && nums[i]!=el1) {el2=nums[i];ct2++;}
            
            else if(el1==nums[i]) ct1++;
            
            else if (el2 == nums[i] ) ct2++;
            
            else {ct1--;ct2--;}
        }
        
        List<Integer> result = new ArrayList<>();
        
        ct1=0;
        ct2=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(el1==nums[i]) ct1++;
            if(el2==nums[i]) ct2++;
        }
        
        if(ct1>(nums.length/3)) result.add(el1);
        if(ct2>(nums.length/3) && el1!=el2) result.add(el2);
        
        return result;
    }
}