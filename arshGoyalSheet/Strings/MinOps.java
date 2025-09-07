package arshGoyalSheet.Strings;

public class MinOps {
    public static void main(String[] args) {
        String s = "yz";
        System.out.println(minimumMoves(s));
    }

    public static  int minimumMoves(String s) {
        int ans =0;
        for (char ch : s.toCharArray()) {
            int diff  = (('a' - ch) + 26) % 26; 
            ans = Math.max(ans, diff);
        }

        return ans;
    }
}
