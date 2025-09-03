package codevita.Usaco.silver.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * question
 * 
 * Farmer John's N
 cows are standing in a row, as they have a tendency to do from time to time. 
 Each cow is labeled with a distinct integer ID number so FJ can tell them apart. 
 FJ would like to take a photo of a contiguous group of cows but,
  due to a traumatic childhood incident involving the numbers 1…6
, he only wants to take a picture of a group of cows if their IDs add up to a multiple of 7.
Please help FJ determine the size of the largest group he can photograph.

INPUT FORMAT (file div7.in):
The first line of input contains N
 (1≤N≤50,000
). The next N
 lines each contain the N
 integer IDs of the cows (all are in the range 0…1,000,000
).
OUTPUT FORMAT (file div7.out):
Please output the number of cows in the largest consecutive group whose IDs sum to a multiple 
of 7. If no such group exists, output 0.
You may want to note that the sum of the IDs of a large group of cows might be too large to 
fit into a standard 32-bit integer. 
If you are summing up large groups of IDs, you may therefore want to use a larger integer 
data type, like a 64-bit "long long" in C/C++.

        SAMPLE INPUT:
        7
        3
        5
        1
        6
        2
        14
        10
        SAMPLE OUTPUT:
        5

 */
public class SubseqSumToSeven {
    private static final int MOD =7;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] pSum = new long[n+1];
        pSum[0] = 0;
        long  e;
        for (int i = 1; i <= n; i++) {
            e = Long.parseLong(br.readLine());
            pSum[i] = pSum[i-1] + e;
        }
        
        int[] modArr = new int[MOD]; //fil the modArray with -1
        Arrays.fill(modArr, -1);


        int rem ;
        int len =0;
        int maxLen =0;
        //traverse through the array an update modArray to getthe length
        for (int i = 0; i < n; i++) {

            rem = (int)(pSum[i] % MOD);

            if (modArr[rem] == -1) {
                modArr[rem] = i; 
            }else{
                //hers if u ddint get -1 meeans youhave a subarry before now cal length betwwen them
                len =( i - modArr[rem]);
                maxLen = Math.max(maxLen, len);
                
            }


        }

        System.out.println(maxLen);
    }
}
