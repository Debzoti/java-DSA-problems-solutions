package arshGoyalSheet.PrefixSum;

import java.util.Arrays;

public class MaxScoreSplit {
    public static void main(String[] args) {
        String str = "1111";
        System.out.println(maxScore(str));
    }

    public static int maxScore(String s) {
        char[] arr = s.toCharArray();
        int[] pSum = new int[arr.length ];
        
        //build the psum arrray
        pSum[0] = arr[0] - '0';
        for (int i = 1; i< pSum.length; i++) {
            pSum[i] = pSum[i-1] + (arr[i] - '0');
        }

        System.out.println(Arrays.toString(pSum));
        //tarveese to the psum ans count 0 each time and
        int maxOne = pSum[arr.length-1];
        int maxAns = 0; 
        for(int i = 0; i<arr.length-1; i++){
            int zerosAti = (i+1) - pSum[i];
            int rightOnes = maxOne - pSum[i]; 
            int res = zerosAti + rightOnes;
            maxAns = Math.max(maxAns, res);
        }
        //if(maxOne ==0) return maxAns -1;
        return maxAns;
    }
}
