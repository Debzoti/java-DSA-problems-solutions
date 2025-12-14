package arshGoyalSheet.BitManipulation;

import java.util.Arrays;

public class SingleNumberIII {
    public static void main(String[] args) {
        int[] arr = {
                1, 2, 1, 3, 2, 5
        };
        System.out.println(Arrays.toString(singleNumber(arr)));
    }

    static int[] singleNumber(int[] nums) {
        int mixed = 0;
        for (int num : nums) {
            mixed ^= num;
        }

        // Get the rightmost set bit
        // This bit is set in one of
        // the unique numbers and unset in the other
        int diff = mixed & -mixed;

        int ans1 = 0;
        int ans2 = 0;

        for (int num : nums) {
            if ((num & diff) == 0) {
                ans1 ^= num;
            } else {
                ans2 ^= num;
            }
        }

        return new int[] { ans1, ans2 };
    }
}
