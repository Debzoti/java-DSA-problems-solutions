package arshGoyalSheet.Maths;

import java.util.Arrays;

public class IntegerSumZero {
        public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.toString(sumZero(n)));
        }

        public static int[] sumZero(int n) {
            int[] ans = new int[n];
            int j = 0;
            for(int i=1; i<=n/2; i++){
                ans[j++] = i;
                ans[j++] = -i;
            }
            if(n%2 != 0){
                ans[j] = 0;
            }
            return ans;
        }
}
