// package codevita.Usaco.silver.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Apartments {

/*
 * Time limit: 1.00 s
Memory limit: 512 MB

Example
Input:
4 3 5
60 45 80 60
30 60 75

Output:
2
 */
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter out = new PrintWriter(System.out);


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] applicants = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            applicants[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] apartments = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            apartments[i] = Integer.parseInt(st.nextToken());
        }

        out.println(findMaxApartments(applicants, apartments, k));
        out.flush();
        out.close();
        br.close();
    }

    public static int findMaxApartments(int[] applicants , int[] apartments, int k) {
        
        Arrays.sort(applicants);
        Arrays.sort(apartments);
        int i =0;
        int j = 0;
        int count = 0;
        while(i < applicants.length && j < apartments.length){
            if(Math.abs(applicants[i] - apartments[j]) <= k) {
                count++;
                i++;
                j++;
                
            }else if(applicants[i] < apartments[j]) {
                i++;
            }else {
                j++;

            }
        }

        return count;
        
    }
}
