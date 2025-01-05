class Solution {

    public boolean isValidBoard(char[][] board, int n, int x, int y) {
        int i, j;

        // Check the row
        for (j = 0; j < n; j++) {
            if (board[x][j] == 'Q' && j != y) return false;
        }

        // Check upper-left diagonal
        i = x - 1;
        j = y - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') return false;
            i--;
            j--;
        }

        // Check lower-right diagonal
        i = x + 1;
        j = y + 1;
        while (i < n && j < n) {
            if (board[i][j] == 'Q') return false;
            i++;
            j++;
        }

        // Check upper-right diagonal
        i = x - 1;
        j = y + 1;
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') return false;
            i--;
            j++;
        }

        // Check lower-left diagonal
        i = x + 1;
        j = y - 1;
        while (i < n && j >= 0) {
            if (board[i][j] == 'Q') return false;
            i++;
            j--;
        }

        return true;
    }

    public void solveNQueensUtil(char[][] board, int n, List<List<String>> result, int col) {
        if (col == n) {
            List<String> tempRes = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder temp = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    temp.append(board[i][j]);
                }
                tempRes.add(temp.toString());
            }
            result.add(tempRes);
            return;
        }

        for (int i = 0; i < n; i++) {
            board[i][col] = 'Q';
            if (isValidBoard(board, n, i, col)) {
                solveNQueensUtil(board, n, result, col + 1);
            }
            board[i][col] = '.';
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> result = new ArrayList<>();
        solveNQueensUtil(board, n, result, 0);
        return result;
    }
}