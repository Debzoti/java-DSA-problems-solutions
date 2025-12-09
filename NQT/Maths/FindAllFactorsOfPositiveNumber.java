package NQT.Maths;

import java.io.*;
import java.util.*;

public class FindAllFactorsOfPositiveNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        findFactors(n);
    }

    static void findFactors(int n){
        ArrayList<Integer> factors = new ArrayList<>();

        //loop upto sqrt n because factors appears in pairs 
        for(int i =1; i<=Math.sqrt(n); i++){

            if (n % i == 0) {
                
                //handle when it reaxches the middle p[oint means the perfect square of n
                if(n/i == i){
                    factors.add(i);
                }else{
                    factors.add(i);
                    factors.add(n/i);
                }
                
            }
        }

        System.out.println(factors);
    }
}
