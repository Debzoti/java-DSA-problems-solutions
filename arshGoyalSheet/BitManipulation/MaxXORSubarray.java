//package arshGoyalSheet.BitManipulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MaxXORSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());  
        
        int n = Integer.parseInt(st.nextToken()); // 4


        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken()); // 5 1 5 9
        }

        System.out.println(maxSumXOR(arr));

    }

    static int maxSumXOR(int[] arr){
        

        return maxXOR;
    }
}
