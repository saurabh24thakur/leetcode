class Solution {
    public void solveSudoku(char[][] board) {
        if(backtrack(board,0,0)){
            printBoard(board);
        }
    }

    public  boolean backtrack(char[][] board,int i,int j){
        if(i==9){
            return true;
        }

        if(j==9){
            return backtrack(board, i+1, 0);
        }

        if (board[i][j] != '.') {
            return backtrack(board, i, j+1);
        }



        for(int k=1;k<=9;k++){
            char ch = (char)('0' + k);
            if (isSafe(board, i, j, ch)) {
                board[i][j]=ch;
                if (backtrack(board, i, j+1)) {
                    return true;
                }
                board[i][j]='.';
            }
        }

        return false;
    }

    public  boolean isSafe(char[][] board, int row, int col, char ch) {
        for (int k = 0; k < 9; k++) {
            // Check row
            if (board[row][k] == ch) return false;

            // Check column
            if (board[k][col] == ch) return false;

            
            int boxRow = 3 * (row / 3) + k / 3;
            int boxCol = 3 * (col / 3) + k % 3;
            if (board[boxRow][boxCol] == ch) return false;
        }
        return true;
    }

    private  void printBoard(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}