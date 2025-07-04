package arshGoyalSheet.Rercursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println( permutationIterative(nums));
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
