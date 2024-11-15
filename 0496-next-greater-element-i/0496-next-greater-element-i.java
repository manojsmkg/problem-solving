class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int n = nums2.length;
        
        int[] nums3 = new int[n];
        
        nums3[n-1] = -1;
        
        Stack<Integer> st = new Stack<>();
        st.push(nums2[n-1]);
        
        for(int i=n-2;i>=0;i--)
        {
            int curr = nums2[i];
            while(st.isEmpty() == false && curr>st.peek()) {
                st.pop();
            }
            if(st.isEmpty()) nums3[i] = -1;
            else nums3[i] = st.peek();
            st.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<n;j++) 
            {
                if(nums1[i] == nums2[j])  { res[i]=nums3[j]; break;}
            }
        }
        return res;

        
    }
}