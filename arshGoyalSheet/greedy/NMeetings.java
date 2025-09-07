package arshGoyalSheet.greedy;


import java.util.Arrays;

public class NMeetings {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        System.out.println(maxMeetings(start, end));
    }
    
    public static int maxMeetings(int start[], int end[]) {
        // add your code here
        int n = start.length;
        int[][] meet = new int[n][2];
        for (int i = 0; i < n; i++) {
            meet[i][0] = start[i];
            meet[i][1] = end[i];
        }
        Arrays.sort(meet, (a, b) -> a[1] - b[1]);
        int count = 1;
        int lastEnd = meet[0][1];
        for (int i = 1; i < n; i++) {
            int interval = meet[i][0] - lastEnd; //i mistaken here previously coz when meeting overlaps if just use
                                                // we cantjust say  int interval = meet[i][0] - meet[i-1][1];
                                                // we have to check with last end time of meeting
                                                //if interval is positive then only we can count this meeting
                                                //if interval is negative or zero then we cant count this meeting
                                                //as meeting is overlapping or touching each other
            if (interval > 0) {
                count++;
                lastEnd = meet[i][1];
            }
        }
        
        return count;
    }
}
