package arshGoyalSheet.Rercursion;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {
            {1,1,1,0},
            {0,1,1,1},
            {1,0,1,1}
        };
        int[][] res = floodFill(image,1,2,2);
        System.out.println(Arrays.toString(res));
    }

    
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            // Code here
            //base case
            dfs(image,sr,sc,newColor);
            return image;
        }
    
        static void dfs(int[][] image, int sr, int sc, int newColor){
            //base case
            //check index validity first
            if (sr<0 || sc<0 || sr >= image.length || sc>= image[0].length) {
                return ;
            }

            //what can go wronng
            // possible we land in cell which is 0 or 2 already marked
            if (image[sr][sc] != 1) {
                return;
            }

            //else what to do

            //make this cell colored
            image[sr][sc] = 2;

            //tarverse up down both make filled with newColor
            dfs(image, sr+1, sc, newColor);
            dfs(image, sr-1, sc, newColor);
            dfs(image, sr, sc+1, newColor);
            dfs(image, sr, sc-1, newColor);

        }
}
