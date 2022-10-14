//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h>
using namespace std;



// } Driver Code Ends
//User function template for C++

class Solution{
  public:
    
    long long int productExcludingCurrZero(vector<long long int>& nums,int i,int n)
    {
        
        long long int product_of_all = 1;

        for(int j=0;j<n;j++)
        {
            if(j!=i) product_of_all*=nums[j];
        }
        //cout<<i<<" "<<product_of_all<<endl;
        return product_of_all;
        
    }
    
    // nums: given vector
    // return the Product vector P that hold product except self at each index
    
    vector<long long int> productExceptSelf(vector<long long int>& nums, int n) 
    {
        long long int product_of_all = 1;
        
        vector<long long int> result_arr;
        
        for(int i=0;i<n;i++)
        {
            product_of_all*=nums[i];
        }
        
        for(int i=0;i<n;i++)
        {
            if(nums[i] != 0)
                result_arr.push_back(product_of_all/nums[i]);
            
            else 
                result_arr.push_back(productExcludingCurrZero(nums,i,n));
        }
        
        return result_arr;
        
    }
};


//{ Driver Code Starts.
int main()
 {
    int t;  // number of test cases
    cin>>t;
    while(t--)
    {
        int n;  // size of the array
        cin>>n;
        vector<long long int> arr(n),vec(n);
        
        for(int i=0;i<n;i++)    // input the array
        {
            cin>>arr[i];
        }
        Solution obj;
        vec = obj.productExceptSelf(arr,n);   // function call
        
        for(int i=0;i<n;i++)    // print the output
        {
            cout << vec[i] << " ";
        }
        cout<<endl;
    }
	return 0;
}
// } Driver Code Ends