package NQT.Arrays ;

public class PossiblePaths {
    public static void main(String[] args) {
        //need to calc possible parth in n*n maze to tp left to bottom right
        int n = 3;
        int[][] maze = {
            {1, 0, 0},
            {1, 1, 0},
            {1, 1, 1}    
        };
        System.out.println(countPaths(maze, 0, 0, n));
        }

    static int countPaths(int[][] maze, int r, int c, int n){
        //base case
        if(r == n-1 && c == n-1){
            return 1;   
        }
        if(r >= n || c >= n || maze[r][c] == 0){
            return 0;
        }
        //rec case
        int count = 0;
        maze[r][c] = 0;
        count += countPaths(maze, r + 1, c, n);
        count += countPaths(maze, r, c + 1, n);
        maze[r][c] = 1;
        return count;
    }
}
