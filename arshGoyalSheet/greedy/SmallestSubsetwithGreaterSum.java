package arshGoyalSheet.greedy;

import java.util.Arrays;

public class SmallestSubsetwithGreaterSum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 10};
        System.out.println(minSubset(arr));
    }

    static int minSubset(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int lSum =0, rSum =0;
        //calculatewhole sum
        for (int i = 0; i < arr.length; i++) {
            lSum += arr[i];
        }

        for (int i = n-1; i>=0; i--){
            rSum += arr[i];
            lSum -=arr[i];

            if (rSum > lSum){
                return n-i;
                
            }
        }
        return n;
    }
}
