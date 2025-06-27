package kunalKuswahaSolutions.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        //using recursion to print all subsets of an array
       int[] arr = {1, 2, 3};
       System.out.println(printSubsets(arr));
    }

    static List<List<Integer>> printSubsets(int[] nums){
        //outer listg consist the all the subsets 
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());

        for (int num : nums) {
             //pick every integer of the nums array 
            int number = num;

            int n = outerList.size();

            //traverese and addd the number to the existing subsets 
            //with cloning the previous memebers
            for (int i = 0; i < n; i++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(i));
                innerList.add(number);
                outerList.add(innerList);

            }

            }
            return outerList;

    }

    static List<List<Integer>> printSubsetsWithDuplicates(int[] nums){
        //outer listg consist the all the subsets 
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());

        for (int num : nums) {
             //pick every integer of the nums array 
            int number = num;

            int n = outerList.size();

            //traverese and addd the number to the existing subsets 
            //with cloning the previous memebers
            for (int i = 0; i < n; i++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(i));
                innerList.add(number);
                outerList.add(innerList);

            }

            }
            return outerList;

    }
}
