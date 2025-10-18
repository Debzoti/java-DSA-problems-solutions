package arshGoyalSheet.Backtracking;

import java.util.ArrayList;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 1, 0, 0,1},
            {1, 1, 1, 1,0},
            {1, 1, 1, 0,1},
            {0, 0, 1, 0,0},
            {1, 1, 1, 1,1}
        };

        System.out.println(ratInMaze(maze));
    }

    public static  ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        return findPath(maze, 0,0,"");
    }

    static ArrayList<String> findPath(int[][] maze, int r, int c, String path){
        //base case
        if(r == maze.length -1 && c == maze[0].length -1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        if (maze[r][c] == 0) {
            return new ArrayList<>(); // return empty list if the cell is blocked
        }
        
        
                ArrayList<String> list = new ArrayList<>();
                //mark as visited
                maze[r][c] = 0;

        //down
        if(r < maze.length -1 && maze[r+1][c] == 1){
            list.addAll(findPath(maze, r + 1, c, path + "D")); // down
        }
        
        //left
        if(c > 0 && maze[r][c-1] == 1){
            list.addAll(findPath(maze, r, c - 1, path + "L")); // left
        }
        //right
        if(c < maze[0].length -1 && maze[r][c+1] == 1){
            list.addAll(findPath(maze, r, c + 1, path + "R")); // right
        }

        //up
        if(r > 0 && maze[r-1][c] == 1){
            list.addAll(findPath(maze, r - 1, c, path + "U")); // up
        }


        //unmark
        maze[r][c] = 1;
        return list;
    }
}
