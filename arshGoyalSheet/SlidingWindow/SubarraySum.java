package arshGoyalSheet.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr ={1,2,3,7,5};
        int target =12;
        System.out.println(subarraySum(arr, target));

    }
     static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int left =0 , right =0;
        int currSum =0;
        
        for ( right = 0; right < arr.length; right++) {
            currSum+=arr[right];
            while (currSum > target && left <= right) {
                currSum-=arr[left];
                left++;
            }

            if (currSum == target) {
                res.add(left + 1);
                res.add(right + 1);
                return res;
            }
        }
        res.add(-1);
        return res;
    }
}
