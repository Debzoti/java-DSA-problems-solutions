// package codevita.Usaco.silver.greedy;


import java.util.Arrays;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TasksAndDeadlines {

    /*
     * Time limit: 1.00 s
Memory limit: 512 MB

You have to process n tasks. Each task has a duration and a deadline, and you will process the tasks in some order one after another. Your reward for a task is d-f where d is its deadline and f is your finishing time. (The starting time is 0, and you have to process all tasks even if a task would yield negative reward.)
What is your maximum reward if you act optimally?
Input
The first input line has an integer n: the number of tasks.
After this, there are n lines that describe the tasks. Each line has two integers a and d: the duration and deadline of the task.
Output
Print one integer: the maximum reward.
Constraints

1 \le n \le 2 \cdot 10^5
1 \le a,d \le 10^6

Example
Input:
3
6 10
8 15
5 12

Output:
2
     */
    public static void main(String[] args) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] duration = new int[n];
        int[] deadline = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            duration[i] = Integer.parseInt(st.nextToken());
            deadline[i] = Integer.parseInt(st.nextToken());
        }   
        System.out.println(maxReward(n,duration, deadline));

    }

    public static long maxReward(int n,int[] duration, int[] deadline) {
        //buiod the task array ans use comaoayoe to sort by duration
        int [][] tasks = new int[n][2];
        for (int i = 0; i < n; i++) {
            tasks[i][0] = duration[i];
            tasks[i][1] = deadline[i];
        }

        Arrays.sort(tasks,(a,b) -> a[0] - b[0]);
        //now calculate the reward

        long currTimne =0, reward =0;

        for (int i = 0; i < n; i++) {
            currTimne += tasks[i][0];
            reward += tasks[i][1] - currTimne;
        }

        return reward;
    }
}


