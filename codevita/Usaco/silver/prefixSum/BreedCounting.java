package codevita.Usaco.silver.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreedCounting {
    
    public static void main(String[] args)  throws IOException{
        

        /*
         * SAMPLE INPUT:
            6 3
            2
            1
            1
            3
            2
            1
            1 6
            3 3
            2 4
            SAMPLE OUTPUT:
            3 2 1
            1 0 0
            2 0 1
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        // build 3 prefix sum arrays of different cows

        int[] psHolsteins = new int[N+1];
        int[] psGuernseys = new int[N+1];
        int[] psJerseys = new int[N+1];

        for (int i = 1; i <= N; i++) {
            //build the arrays
            psHolsteins[i ] = psHolsteins[i-1];
            psGuernseys[i] = psGuernseys[i-1];
            psJerseys[i] = psJerseys[i-1];
            
            int breed = Integer.parseInt(br.readLine());

            if (breed == 1) {
                psHolsteins[i]++;
            } else if(breed == 2) {
                psGuernseys[i]++;
            }else{
                psJerseys[i]++;
            }
        }

        //return the cowbreed inside Q queries
        for (int i = 0; i < Q; i++) {
            StringTokenizer query = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(query.nextToken());
			int end = Integer.parseInt(query.nextToken());

			int holstein = psHolsteins[end] - psHolsteins[start - 1];
			int guernsey = psGuernseys[end] - psGuernseys[start - 1];
			int jersey = psJerseys[end] - psJerseys[start - 1];
			System.out.println(holstein + " " + guernsey + " " + jersey);
        }
    }
}
