package arshGoyalSheet.greedy;

import java.util.Arrays;

public class MinCostToCutABoard {
    public static void main(String[] args) {
        int[] X = {1, 1, 1};
        int[] Y = {1, 1, 1};
        System.out.println(minCost(4,4,X, Y));
    }u

    public static int minCost(int n, int m, int[] x, int[] y) {
        // code here
        Arrays.sort(x);
        Arrays.sort(y);
        
        int i = x.length - 1;
        int j = y.length -1;
        int hSegs = 1;
        int vSegs = 1;
        int cost = 0;

        //chek both arn from end if bigger elm founf cut it and add t cost
        while (i>=0 && j>=0) {
            if(x[i] > y[j] ) {
                cost+= x[i] * hSegs;
                vSegs++;
                i--;
            }else {
                cost+= y[j] * vSegs;
                hSegs++;
                j--;
            }
        }


        //if anythimng remins adds up to coast
        while (i >= 0) {
            cost+= x[i] * hSegs;
            i--;
            vSegs++;
        }
        while (j >= 0) {
            cost+= y[j] * vSegs;
            j--;
            hSegs++;
        }

        return cost;
    }
}
