package arshGoyalSheet.Rercursion;

import java.util.ArrayList;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(subsetSums(arr));
    }

     public static  ArrayList<Integer> subsetSums(int[] arr) {
        // code here
       ArrayList<Integer> res = new ArrayList<>();
       dfs(0,0,arr,res);
       return res;
    }

    static void dfs(int start, int currSum, int[] arr, ArrayList<Integer> res){
        //base case
        if(start == arr.length){
            res.add(currSum);
            return;
        }

        dfs(start + 1, currSum + arr[start], arr, res);
        
        dfs(start + 1, currSum, arr, res);
    }
}
