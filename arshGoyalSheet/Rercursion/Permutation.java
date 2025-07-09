package arshGoyalSheet.Rercursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println( permutationRecursive(nums));
    }

    static List<List<Integer>>  permutationRecursive(int[] nums){

        //recursive logic
        //base case
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,0,ans);
        return ans;
    }
    static void solve(int[] nums , int start, List<List<Integer>> list){

        //base case

        for (int num : nums) {
            \
        }
    }
    
    static List<List<Integer>>  permutationIterative(int[] arr){

        //iterative logic
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<Integer>()); // inserting empty list

        for (int i=0; i<arr.length; i++) {
            //local results
            List<List<Integer>> localList = new ArrayList<>();
            for (List<Integer> perms : outerList) {
                for(int j =0; j<=perms.size();j++){
                    List<Integer> member = new ArrayList<>(perms);
                    member.add(j,arr[i]);
                    localList.add(member);
                }
            }
            outerList=localList;
        }
        return outerList;
    }

}
