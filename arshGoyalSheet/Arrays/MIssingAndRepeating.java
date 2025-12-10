package arshGoyalSheet.Arrays;

import java.util.*;

public class MIssingAndRepeating {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 5};
        System.out.println(missingRepeating(arr));
    }

    static ArrayList<Integer> missingRepeating(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int correct_idx = 0, i = 0;
        while (i < n) {
            correct_idx = arr[i] - 1;
            if (arr[i] != arr[correct_idx]) {
                swap(arr, i, correct_idx);
            } else {
                i++;
            }
        }

        // chcek mising andf repeating
        for (int idx = 0; idx < n; idx++) {
            if (arr[idx] != idx + 1) {
                ans.add(arr[idx]);
                ans.add(idx + 1);
                break;
            }
        }
        return ans;
    }

    static void swap(int[] arr, int i, int correct_idx) {
        int temp = arr[i];
        arr[i] = arr[correct_idx];
        arr[correct_idx] = temp;
    }


    //another approach sum and squared sum 
    
}
