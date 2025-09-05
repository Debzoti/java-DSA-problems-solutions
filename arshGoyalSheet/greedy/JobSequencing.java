package arshGoyalSheet.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JobSequencing {
    public static void main(String[] args) {
        int[] deadline = {4, 1, 1, 1};
        int[] profit ={20, 10, 40, 30};

        System.out.println(jobSequencing(deadline,profit));

        //got the tle error use disjooint set unit(DSU)
    }

     public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        //sort [pairwise]
        int[][] jobs = new int[deadline.length][2];
        for (int i = 0; i < jobs.length; i++) {
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
        }
        Arrays.sort(jobs, (a,b) -> b[1] - a[1]);
        int totalProfit =0;
        HashMap<Integer,Integer> map =  new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < jobs.length; i++) {
            int p = jobs[i][1];
            
            for (int j = jobs[i][0]; j > 0; j--) {
                if (map.get(j) == null) {
                    map.put(j, p);
                    break;
                }
            }
        }

        //build res arraylust here
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            totalProfit+= entry.getValue();
        }

        list.add(map.size());
        list.add(totalProfit);
        return list;
    } 
}
