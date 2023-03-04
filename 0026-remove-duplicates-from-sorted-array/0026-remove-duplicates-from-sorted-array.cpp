class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        int size=nums.size();
        
        int i=0;
        
        vector<int>::iterator ptr;
        ptr = nums.begin()+1;
        
        while ( ptr < nums.end())
        {
            if(*ptr != *(ptr-1)) ptr++;
            else
                nums.erase(ptr);
        
        }

        
        return nums.size();
        
        
        
    }
};