class Solution {

    public boolean isValidBoard(char[][] board,int n,int x,int y)
    {

        int i,j;

        i=x;
        j=0;
        for(j=0;j<n;j++)
        {
            if(board[i][j] == 'Q' && j!=y) return false;
        }

        i=x-1;
        j=y-1;
        while(i>=0 && j>=0 && i<n && j<n)
        {   
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }

        i=x+1;
        j=y-1;
        while(i>=0 && j>=0 && i<n && j<n)
        {
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }

        return true;
    }

    public void solveNQueensUtil(char[][] board,int n,List<List<String>> result,int col)
    {
        if(col==n)
        {  
            List<String> tempRes = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                String temp = "";
                for(int j=0;j<n;j++)
                {
                    temp += board[i][j];
                }
                tempRes.add(temp);
            }
            result.add(tempRes);
            return;
        }

        for(int i=0;i<n;i++)
        {
            board[i][col] = 'Q';
            if(isValidBoard(board,n,i,col))
            {
                solveNQueensUtil(board,n,result,col+1);
            }
            board[i][col] = '.';
        }
    }
    
    public List<List<String>> solveNQueens(int n) 
    {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        List<List<String>> result= new ArrayList<>();
        solveNQueensUtil(board,n,result,0);
        return result;
    }
}