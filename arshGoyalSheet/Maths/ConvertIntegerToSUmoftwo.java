package arshGoyalSheet.Maths;

import java.util.Arrays;

public class ConvertIntegerToSUmoftwo {
    public static void main(String[] args) {
        int n =1010;
        int[] ans = getNoZeroIntegers(n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getNoZeroIntegers(int n) {
        if (n < 2 || n > 10_000) return new int[]{};
        for (int i = 1; i < n; i++) {
            String a = String.valueOf(i);
            String b = String.valueOf(n - i);
            if (!a.contains("0") && !b.contains("0")) {
                return new int[]{i, n - i};
            }   
            
        }
        return new int[]{};
    }
}
