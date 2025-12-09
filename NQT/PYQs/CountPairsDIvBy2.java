package NQT.PYQs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * Count Pairs divisible by 2
You're given a list of numbers. Your task is to find
 how many pairs of numbers in that list add up to an even number.
  A pair consists of two different numbers from the list.
   For example, in the list [1, 2, 3, 4], 
   the pairs that sum to an even number are (1, 3) and (2, 4).

Input Format
The first line of input will contain a single integer 
T, denoting the number of test cases.
Each test case consists of two lines of input.

The first line of each test case contain 
N, length of array arr.

The second line consist of the array arr.
arr.
Output Format
For each test case, output on a new line the number of divisible pairs.

 
Sample 1:
Input
3
4
6 1 2 3
6
2 2 1 7 5 3
2
4 8

Output
2
7
1
Explanation:
Test Case 1: There are only two pairs formed- (6,2) and (1,3).
Test case 2: These are the 7 pairs that are formed- (2,2), (1,7), (1,5), (1,3), (7,5), (7,3), (5,3).
Test case 3: There is only one pair that is formed- (4,8).
 */

public class CountPairsDIvBy2  {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine());

        //chcek for all testcase

        while (testCases > 0) {
            int len = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" "); //taling values from input

            //logic here
            //lgiv id to find the no of odd and even thme we cvan find tortal pairs 
            long evenCount = 0, oddCount =0;

            for(int i =0; i< len ; i++){
                int num = Integer.parseInt(input[i]);
                if(num %2 == 0){
                    evenCount ++;
                }else{
                    oddCount++;
                }
            }

            long oddPairs  = (oddCount * (oddCount - 1))/2;
            long evenPairs  = (evenCount * (evenCount - 1))/2;
            long pairs = oddPairs + evenPairs;
            System.out.println(pairs);
            testCases --;
        }
        
        br.close();
    }
}

    