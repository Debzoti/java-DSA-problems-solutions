package arshGoyalSheet.Rercursion;

public class PairFreinds {
    public static void main(String[] args) {
        System.out.println(possiblePairs(3));
    }

    static long possiblePairs(int n){
        //base
        if(n == 1 || n== 0){
            return 1;
        }
        //induction
        long single = possiblePairs(n-1);
        long pairs = possiblePairs(n - 2) * (n-1);  
        
        //induction
        return single + pairs;
    }
}
