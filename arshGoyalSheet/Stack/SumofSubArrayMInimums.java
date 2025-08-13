package arshGoyalSheet.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SumofSubArrayMInimums {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int ans = sumSubarrayMins(arr);
        System.out.println(ans);
    }

    public static int sumSubarrayMins(int[] arr) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> nsl = new ArrayList<>();
        ArrayList<Integer> nsr = new ArrayList<>();
        long[] subArrayCount = new long[arr.length];
        long[] partInSubArray = new long[arr.length];
        long sum =0;
        long MOD = 1000000007;

        //build nsl and nsr
        NSL(s, nsl, arr);
        s.clear();
        NSR(s, nsr, arr);

        for (int i = 0; i < subArrayCount.length; i++) {
            long leftCount = i - nsl.get(i);
            long rightCount = nsr.get(i) - i;
            subArrayCount[i] = (leftCount * rightCount) % MOD;
            partInSubArray[i]=(arr[i]*subArrayCount[i] ) % MOD;
            sum = (sum + partInSubArray[i]) % MOD;


        }
        return (int)sum;
}

    static void NSL(Stack<Integer> s, ArrayList<Integer> res, int[] arr){

        for (int j = 0; j < arr.length; j++) {
            
                    while (!s.isEmpty() && arr[s.peek()]>arr[j]) {
                        s.pop();
                    }
                    if (s.isEmpty()) {
                        res.add(-1);
                    }else{
                        res.add(s.peek());
                    }
            s.push(j);
        }
    }

    static void NSR(Stack<Integer> s, ArrayList<Integer> res, int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) { // go from right to left for NSR
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                res.add(n); // no smaller element to the right
            } else {
                res.add(s.peek()); // index of next smaller element
            }
            s.push(i);
        }
        Collections.reverse(res); // because we traversed backwards
    }
}
