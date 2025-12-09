package arshGoyalSheet.DP;

public class DivisorsGame {
    public static void main(String[] args) {
        System.out.println(divisorsGame(5));
    }

    static boolean divisorsGame(int n ){
        //base 
        if(n ==1 ) return false;

        Boolean[] dp = new Boolean[n+1];

        //if n is alreasdy calulated use it 
        if(dp[n] != null) return dp[n];

        //hypotheisi
        //i hvae to find the number s which using only i can win means opponent looses
        for(int x =1; x<=n ; x++){
            
        }

    }
}
