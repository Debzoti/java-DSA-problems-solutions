package arshGoyalSheet.greedy;

import java.util.Arrays;

public class SJF {
    public static void main(String[] args) {
        int[] bt = {4,3,7,1,2};
        System.out.println(solve(bt));
    }

    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int wt =0, totalWt =0;

        for (int i = 0; i < bt.length - 1; i++) {
            wt += bt[i];
            totalWt += wt;
        }

        return (int)(totalWt / bt.length);
    }
}
