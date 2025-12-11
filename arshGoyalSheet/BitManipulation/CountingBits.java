package arshGoyalSheet.BitManipulation;
import java.util.*;
public class CountingBits {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(countBits(n)));
    }

    static int[] countBits(int n) {
        int[] res = new int[n + 1];

        for (int idx = 0; idx < n + 1; idx++) {
            int temp = idx;
            int count = 0;
            while (temp > 0) {
                if ((temp & 1) == 1) {
                    count++;
                }

                temp = temp >> 1;
            }
            res[idx] = count;
           
        }
        return res;
    }
}
