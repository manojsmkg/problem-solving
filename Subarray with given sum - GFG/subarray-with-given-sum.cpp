//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution
{
    public:
    //Function to find a continuous sub-array which adds up to a given number.
    vector<int> subarraySum(int arr[], int n, long long s)
    {
        vector<int> result;
        
        long long start=0,end=0;
        
        long long  sum=arr[start];
        while(start < n && end < n)
        {
            if(sum == s)
            {
                result.push_back(start+1);
                result.push_back(end+1);
                break;
            }
            else if(sum<s)
            {
                end++;
                sum+=arr[end];
            }
            else
            {
                sum-=arr[start];
                start++;
            }
        }
        
        if(result.size() == 0 || s==0)
        {
            result.clear();
            result.push_back(-1);
        }
        return result;
    }
};

//{ Driver Code Starts.

int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        long long s;
        cin>>n>>s;
        int arr[n];
        const int mx = 1e9;
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        Solution ob;
        vector<int>res;
        res = ob.subarraySum(arr, n, s);
        
        for(int i = 0;i<res.size();i++)
            cout<<res[i]<<" ";
        cout<<endl;
        
    }
	return 0;
}
// } Driver Code Ends