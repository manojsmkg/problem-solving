class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        
        reverse(digits.begin(),digits.end());
            
        vector<int>:: iterator ptr;
        
        ptr=digits.begin();
        int temp=1;
        
        while(ptr!=digits.end() && temp==1)
        {
            temp = *(ptr) +1;
            //cout<<temp;
            if(temp==10) {temp=1;*ptr=0;}
            else {*ptr=temp;temp=0;}
            ptr++;
        }
        if(ptr==digits.end() && temp==1) digits.push_back(1);
        reverse(digits.begin(),digits.end());
        return digits;
        
    }
};