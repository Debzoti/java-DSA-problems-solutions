package arshGoyalSheet.Rercursion;

public class IlandPerimeter {
    public static void main(String[] args) {
        int[][] grid = {
            {1,1,1,0},
            {0,1,1,1},
            {1,0,1,1}
        };
        System.out.println(islandPerimeter(grid));
    }
    public int islandPerimeter(int[][] grid) {
        int boundary =0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    boundary+=4;
                    //check neigbours riht and down
                    if (col+1 < grid[0].length && grid[row][col+1]==1) {
                        boundary-=2;
                    }
                    if (row-1 <grid.length && grid[row+1][col] ==1 ) {
                        boundary-=2;
                    }

                }
            }
        }
        return boundary;
    }
}
