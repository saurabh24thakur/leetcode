class Solution {
    public boolean exist(char[][] board, String word) {
        boolean exists = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                
                if (search(board, word, i, j, 0)) {
                    exists = true;
                    break; 
                }
            }
        }
        return exists;
    }

    public  boolean search(char[][] board, String word, int i, int j, int index) {
        //  Success Base Case: We've matched every character in the word
        if (index == word.length()) {
            return true;
        }

        //  Failure Base Case: Out of bounds OR character doesn't match
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        //  Mark as Visited: Prevent using the same cell twice in one path
        char temp = board[i][j];
        board[i][j] = '#'; 

        // Explore Neighbors: Try Up, Down, Left, Right
        // We use index + 1 to check the next letter in the string
        boolean found = search(board, word, i + 1, j, index + 1) ||
                        search(board, word, i - 1, j, index + 1) ||
                        search(board, word, i, j + 1, index + 1) ||
                        search(board, word, i, j - 1, index + 1);

        // 5. Backtrack: Restore the original character so other paths can use it
        board[i][j] = temp;

        return found;
    }
}