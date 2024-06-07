class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int rows=matrix.size();
        int cols=matrix[0].size();
        
        vector<int> rowInd(rows,1);
        vector<int> colInd(cols,1);
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]==0) {
                    rowInd[i]=0;
                    colInd[j]=0;
                }
            }
        }
        
        for(int i=0;i<rows;i++)
        {
            if(rowInd[i]==0)
            {
                for(int j=0;j<cols;j++)
                    matrix[i][j]=0;
            }
        }
        
        for(int j=0;j<cols;j++)
        {
            if(colInd[j]==0)
            {
                for(int i=0;i<rows;i++)
                    matrix[i][j]=0;
            }
        }        
    }
};