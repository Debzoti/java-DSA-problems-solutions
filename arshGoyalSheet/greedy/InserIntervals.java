package arshGoyalSheet.greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class InserIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] ans = insert(intervals, newInterval);
        for (int[] row : ans) {
            System.out.println("[" + row[0] + "," + row[1]+ "]");
        }
        
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        
        
       ArrayList<int[]> list = new ArrayList<>();
       int i=0, n = intervals.length;

       while (i < n && intervals[i][1] < newInterval[0] ) {
            list.add(intervals[i]);
            i++;
       }


       while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
       }
       list.add(newInterval);

       while (i<n) {
            list.add(intervals[i]);
            i++;
       }

       return list.toArray(new int[list.size()][]);

    }
}
