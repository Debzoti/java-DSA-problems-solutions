package kunalKuswahaSolutions.Backtracking;

import java.util.ArrayList;

public class matrixPath {
    public static void main(String[] args) {
        // print matrix along with he path
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int [][] matrix = new int[board.length ][board[0].length];

        System.out.println(allPathReturn(board, 0, 0, "", matrix, 1));
    }

     static ArrayList<String> allPathReturn(boolean[][] board, int r, int c, String path, int [][] matrix, int step){
        //base 
        if( r== board.length -1 && c == board[0].length -1){
            matrix [r][c] =step;
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            printMatrix(matrix);
            System.out.println();
            return list;
             }
    
             if(!board[r][c]){
                return new ArrayList<>(); // return empty list if the cell is blocked
             }
                ArrayList<String> list = new ArrayList<>();


                //make thevisited ones false
                board[r][c] = false;
                matrix[r][c] = step;

                //down
                if (r< board.length - 1) {
                    list.addAll(allPathReturn(board, r + 1, c, path + "D", matrix, step+1)); // down
                    
                }
                
                //right
                if (c < board[0].length - 1) {
                    list.addAll(allPathReturn(board, r, c + 1, path + "R", matrix, step+1)); // right
                }

                //up
                if (r > 0) {
                    list.addAll(allPathReturn(board, r - 1, c, path + "U",matrix,step+1)); // up
                }
                //left
                if (c>0) {
                    list.addAll(allPathReturn(board, r, c - 1, path + "L",matrix,step+1)); // left
                }

                //make thevisited ones true for abpve functon calls
                board[r][c] = true;
                matrix [r][c] = 0; // changing the mark cells back to 0 for further recyrsip0n calls 


                return list; // return the list
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    

}
