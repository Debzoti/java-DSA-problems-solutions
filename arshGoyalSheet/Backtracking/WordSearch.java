package arshGoyalSheet.Backtracking;

public class WordSearch {
    public static void main(String[] args) {
        String[][] board = {
            
            {"A","B","C","E"},
            {"S","F","C","S"},
            {"A","D","E","E"}
    };
        boolean isHere = exist(board,"ABCB");
        System.out.println(isHere);
    }

    static boolean exist(String[][] board, String word){

        boolean[][] visited = new boolean[board.length][board[0].length];
        //find the first char of the word in board
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col].charAt(0) == word.charAt(0)) {
                    //find thw whole word in the board
                    if(isThere(board,visited,word,row,col,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean isThere(String[][] board,boolean[][] visited,String word, int row, int col, int k){

        //check the things which can go wrong

        //always chcek bounds first
        //if the row nad col values are not valid(row or col less  or pass limit or cell is already visited)
        if(!isValid(row,col,board,visited)) return false;
        //if elemnt doesnot match
        if(board[row][col].charAt(0) != word.charAt(k)) return false;
        


        //thimgs can go right

        //you find all elements
        if(k == word.length()-1) return true;
        //mark its alrady visited
        visited[row][col]=true;

        //things we have to check repeatdely
        // possibe moves from a valid row col value

        //go up and down
        if(isThere(board, visited, word, row-1, col, k+1)) return true;
        if(isThere(board, visited, word, row+1, col, k+1)) return true;
        //move right and left
        if(isThere(board, visited, word, row, col+1, k+1)) return true;
        if(isThere(board, visited, word, row, col-1, k+1)) return true;


        //if nothing works we backtrack changes and return false
        visited[row][col]=false;
        return false;
    }

    static boolean isValid(int row, int col,String[][] board, boolean[][] visited){
        if (row>=0 && row<board.length && col>=0 && col<board[0].length && !visited[row][col]) {
            return true;
        }
        return false;
    }
}
