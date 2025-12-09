package NQT.Maths;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClimibingStairs {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            System.out.println(climbStairs(n));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int first = 1;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }
}
