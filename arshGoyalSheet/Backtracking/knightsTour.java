package arshGoyalSheet.Backtracking;
import java.util.ArrayList;
public class knightsTour {
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        System.out.println(knightTour(board, 0, 0, 1));
    }

    static ArrayList<ArrayList<Integer>> knightTour(int[][] board , int r, int c, int move){
        //base case
        if(move == board.length * board.length){
            board[r][c] = move;
            // printBoard(board);
            // System.out.println();
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    temp.add(board[i][j]);
                }
            }
            list.add(temp);
            return list;
        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //mark the cell as visited
        board[r][c] = move;

        //possible moves of knight
        int[] rowMoves = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};

        for (int i = 0; i < 8; i++) {
            int newRow = r + rowMoves[i];
            int newCol = c + colMoves[i];

            //check if the new position is valid
            if (isValid(board, newRow, newCol)) {
                list.addAll(knightTour(board, newRow, newCol, move + 1));
            }
        }

        //unmark the cell
        board[r][c] = 0;

        return list;

    }

    static boolean isValid(int[][] board, int r, int c){
        if(r >= 0 && r < board.length && c >= 0 && c < board[0].length && board[r][c] == 0){
            return true;
        }
        return false;
    }
}
