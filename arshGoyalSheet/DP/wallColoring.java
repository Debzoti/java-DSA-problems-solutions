package arshGoyalSheet.DP;
public class wallColoring {
    public static void main(String[] args) {
        int[][] costs ={
            {17,2,17},
            {16,16,5},
            {14,3,19}
        };
        System.out.println(minCost(costs));
    }
    public static int minCost(int[][] costs) {
        int n = costs.length;
        int[] prev = new int[];
        
    }
}