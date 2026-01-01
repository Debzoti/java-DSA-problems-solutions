package arshGoyalSheet.PrefixSum;

import java.util.Arrays;

public class ProductArray {
    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3}; 
        int [] res =productExceptSelf(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        //build prefix frim left  ro iright
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }

        //build suffix right to left
        int suffix = 1;
        for(int j = n-1; j>=0; j-- ){
            ans[j] *=suffix;
            suffix*=nums[j];

        }

        return ans;
    }
}
