//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    bool isRotated(string str1, string str2)
    {
       int l1=str1.length();
       int l2=str2.length();
       
       if(l1!=l2) return false;
        
       string toBeChecked = str1 + str1;
       string toBeCheckedRev = str2 + str2;
       
       if(toBeChecked.substr(2,l1) == str2 || toBeCheckedRev.substr(2,l2) == str1) 
            return true;
       
       return false;
       
    }

};


//{ Driver Code Starts.

int main() {
	
	int t;
	cin>>t;
	while(t--)
	{
		string s;
		string b;
		cin>>s>>b;
		Solution obj;
		cout<<obj.isRotated(s,b)<<endl;
	}
	return 0;
}

// } Driver Code Ends