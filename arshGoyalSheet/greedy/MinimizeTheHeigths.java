package arshGoyalSheet.greedy;

import java.util.Arrays;

public class MinimizeTheHeigths {
    public static void main(String[] args) {
        int[] arr ={1, 5, 8, 10};
        System.out.println( getMinDiff(arr,2));
    }

    public static  int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int initDiff =arr[arr.length -1] - arr[0];
        int diff = initDiff;

        for (int i = 0; i < arr.length - 1; i++) {
            int min = Math.min(arr[0] + k, arr[i + 1] - k);
            int max = Math.max(arr[i] + k, arr[arr.length - 1] - k);
            diff = Math.min(diff, max - min);
        }
                

        return diff;
    }
}
