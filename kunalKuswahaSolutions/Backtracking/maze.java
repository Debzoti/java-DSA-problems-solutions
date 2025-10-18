package kunalKuswahaSolutions.Backtracking;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
    //   int ans = mazePath(0, 0, 0);
    //   System.out.println(ans);
    // System.out.println(showPathWithDiagonal("", 3, 3)); // show all the paths
    boolean[][] board = {
        {true, true, true},
        {true, true, true},
        {true, true, true}
    };

    System.out.println(allPath(board, 0, 0, ""));
    }

    static int mazePath(int row, int col, int path) {
        //base case
        if (row == 2 || col == 2) {
            return 1;
            
        }
        int right = mazePath(row + 1, col, path); // down
        int down = mazePath(row, col + 1, path); // right
        path = right + down; // add the number of paths from down and right
        return path;
    } 

    static ArrayList<String> showPath(String p, int r, int c){
        // base 
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p); // add the string to the list
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        //left
        if(r > 0){
            list.addAll(showPath(p + "D", r - 1, c)); // down
        }
        //down
        if(c > 0){
           list.addAll(showPath(p + "R", r, c - 1)); // right
        }
        return list; // return the list
    }


    static ArrayList<String> showPathWithDiagonal(String p, int r, int c){
        // base 
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p); // add the string to the list
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        //left
        if(r > 0){
            list.addAll(showPathWithDiagonal(p + "D", r - 1, c)); // down
        }
        //down                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        if(c > 0){
           list.addAll(showPathWithDiagonal(p + "R", r, c - 1)); // right
        }
        //diagonal
        if(r > 0 && c > 0){
            list.addAll(showPathWithDiagonal(p + "d", r - 1, c - 1)); // diagonal
        }
        return list; // return the list
    }


    static ArrayList<String> mazeWIthObstacles (boolean[][] board, int r, int c, String path){
        
    //base case
    if( r== board.length -1 && c == board[0].length -1){
        ArrayList<String> list = new ArrayList<>();
        list.add(path);
        return list;
        }

        if(!board[r][c]){
            return new ArrayList<>(); // return empty list if the cell is blocked
        }
            ArrayList<String> list = new ArrayList<>();

            //down
            if (r< board.length - 1) {
                list.addAll(mazeWIthObstacles(board, r + 1, c, path + "D")); // down
                
            }
            
            //right
            if (c < board[0].length - 1) {
                list.addAll(mazeWIthObstacles(board, r, c + 1, path + "R")); // right
            }
            return list; // return the list
    }


    // ayoo backtracking here 
    static ArrayList<String> allPath(boolean[][] board, int r, int c, String path){
        //base 
        if( r== board.length -1 && c == board[0].length -1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
            }
    
            if(!board[r][c]){
                return new ArrayList<>(); // return empty list if the cell is blocked
            }
                ArrayList<String> list = new ArrayList<>();
                //make thevisited ones false
                board[r][c] = false;


                //down
                if (r< board.length - 1) {
                    list.addAll(allPath(board, r + 1, c, path + "D")); // down
                    
                }
                
                //right
                if (c < board[0].length - 1) {
                    list.addAll(allPath(board, r, c + 1, path + "R")); // right
                }

                //up
                if (r > 0) {
                    list.addAll(allPath(board, r - 1, c, path + "U")); // up
                }
                //left
                if (c>0) {
                    list.addAll(allPath(board, r, c - 1, path + "L")); // left
                }

                //make thevisited ones true for abpve functon calls
                board[r][c] = true;
                return list; // return the list
    }


}
