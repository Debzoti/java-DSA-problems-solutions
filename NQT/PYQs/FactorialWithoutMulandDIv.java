package NQT.PYQs;
 import java.io.*;


/*
 * Factorial without Multiplication & Division
You are given a positive integer 
N. Your task is to compute the factorial of 
N without using any multiplication 
(∗) or division 
(/) operators.

Factorial of a number 
N
N is defined as: 
N!=N×(N−1)×(N−2)×...×1.

Input Format
The first line of input will contain a single integer 
T, denoting the number of test cases.
Each of the next 
T lines will contain a single integer 
N, where 
N is the number for which you need to calculate the factorial.
Output Format
For each test case, output the factorial of the given number 
N
N.
 */
public class FactorialWithoutMulandDIv {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long res = fact(1,2,num);
        System.out.println(res);
    }

    static long fact(long res, int start, int end ){
        //base case 
        if (start > end ) {
            return res;
        }

        //hypothesis
        res = adder(res,start);

        return fact(res, start+1, end);
    }

    static long adder(long res, int start){
        long temp = 0;
        for(int i = 0; i<start; i++){
            temp+= res;
        }

        return temp;
    }
}
