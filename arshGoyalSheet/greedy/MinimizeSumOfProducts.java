package arshGoyalSheet.greedy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class MinimizeSumOfProducts {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(6, 1, 9, 5, 4);
        List<Integer> b = Arrays.asList(3, 4, 8, 2, 4);
        System.out.println(minValue(a, b));
    }

    public static long minValue(List<Integer> arr1, List<Integer> arr2) {
        // code here
        Collections.sort(arr1);
        Collections.sort(arr2);
        
        int n = arr1.size();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1.get(i) * arr2.get(n - i - 1);
        }
        return sum;
    }
}