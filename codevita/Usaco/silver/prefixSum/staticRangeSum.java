package codevita.Usaco.silver.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class staticRangeSum {
    public static void main(String[] args) throws IOException {

        /*
         * input pattern
         *  5 5
            1 10 100 1000 10000
            2 3
            0 3
            2 5
            3 4
            0 5
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        //build the prefixarray
        long[] prefix = new long[N+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            long a = Long.parseLong(st.nextToken());
            prefix[i + 1] = prefix[i] + a;
        }

        //return result acc to input
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            sb.append(prefix[r] - prefix[l]).append("\n");

        }

        System.out.print(sb.toString());
    }
}
