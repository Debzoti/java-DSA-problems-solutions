package kunalKuswahaSolutions.Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueens(board,0));
    }

    static int nQueens(boolean[][] board, int row) {
        // base case
        if (row == board.length) {
            return 1; // all queens are placed
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true; // place the queen
                count += nQueens(board, row + 1); // call the function for the next row
                board[row][col] = false; // backtrack
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board, int row, int col) {
        // check for the column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // check for the left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        // check for the right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true; // safe to place the queen
    }
    static void printBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print((cell ? "Q" : ".") + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
