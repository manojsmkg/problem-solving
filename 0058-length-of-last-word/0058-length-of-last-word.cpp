class Solution {
public:
    int lengthOfLastWord(string s) {

        int length=s.length();

        if(length==1) return 1;
        
        int i=length-1,wl=0;

        while(i>=0 && s[i]==' ') i--;

        while(i>=0 && s[i]!=' ')
        {
            wl++;
            i--;
        }
        return wl;
        
    }
};