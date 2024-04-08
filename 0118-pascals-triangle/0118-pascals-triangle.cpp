class Solution {
public:
    
    int calcNcR(int n,int r)
    {
        long long res=1;
        for(int i=0;i<r;i++)
        {
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int)res;
    }
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> finalRes;
        
        for(int i=1;i<=numRows;i++)
        {
            vector<int> temp;
            for(int j=1;j<=i;j++)
            {
                temp.push_back(calcNcR(i-1,j-1));
            }
            finalRes.push_back(temp);  
        }
        return finalRes;
        
    }
};