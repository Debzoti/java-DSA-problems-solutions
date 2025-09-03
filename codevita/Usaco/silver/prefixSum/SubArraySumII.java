

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SubArraySumII {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        //catch the array
        long[] arr = new long[n];
        StringTokenizer ele = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(ele.nextToken());
        }

        //build the prefix array ??
        //no we use hashmap to store the component of the subtraction
        //and compar and check ifd it exist and store it in answer if it matches

        long ans = 0;
        long pSum = 0;
        HashMap<Long,Integer> map = new HashMap<>();
        map.put((long)0, 1);

        for (Long no : arr) {
            pSum+=no;

            //if complement exisct update answers
            if (map.containsKey(pSum-x)) {
                ans+=map.get(pSum-x);
            }

            //if psum exist add it in key else update its value
            if (!map.containsKey(pSum)) {
                map.put(pSum, 1);
            } else {
                map.put(pSum, map.get(pSum) + 1);
            }
        }

        System.out.println(ans);
    }
}
