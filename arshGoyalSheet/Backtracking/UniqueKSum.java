package arshGoyalSheet.Backtracking;

import java.util.ArrayList;

public class UniqueKSum {
    public static void main(String[] args) {
        System.out.println(combinationSum(9, 3));
    }

    public static ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        dfs(k,n, 0, 1, curr, res);
        return res;
    }

    public static void dfs(int maxSize, int maxSum, int currSum, int start,
    ArrayList<Integer> curr,  ArrayList<ArrayList<Integer>> res){

        //when to add
        if (maxSize ==0 && currSum == maxSum) {
            res.add(new ArrayList<>(curr));
            return;
        }

        //things to handle
        if (maxSize == 0 || currSum > maxSum) {
            return;
        }

        //loop logic
        for (int i = start; i < 10; i++){
            //add currsum and curr
            currSum += i;
            curr.add(i);

            dfs(maxSize - 1, maxSum, currSum, i + 1, curr, res);

            //backtrack if goes wromg
            currSum-=i;
            curr.remove(curr.size() - 1);
        }
    }
}
