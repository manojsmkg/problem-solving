class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        
        set<int> flagRows;
        set<int> flagCols;
        
        int m=matrix.size();
        int n=matrix[0].size();
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    flagRows.insert(i);
                    flagCols.insert(j);
                }
            }
        }
        
        for(auto i:flagRows)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=0;
            }
        }
        
        for(auto j:flagCols)
        {
            for(int i=0;i<m;i++)
            {
                matrix[i][j]=0;
            }
        }
        
    }
};