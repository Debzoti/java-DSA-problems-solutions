package kunalKuswahaSolutions.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        //using recursion to print all subsets of an array
       int[] arr = {1, 2, 2};
       System.out.println(printSubsetsWithDuplicates(arr));
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
                List<Integer> innerList = new ArrayList<>(outerList.get(i)); //thtas how you clone
                innerList.add(number);
                outerList.add(innerList);

            }

            }
            return outerList;

    }

    static List<List<Integer>> printSubsetsWithDuplicates(int[] nums){
        Arrays.sort(nums);
        //outer listg consist the all the subsets 
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i<nums.length; i++) {
             //pick every integer of the nums array 
            int number = nums[i];
            start = 0; 
            int n = outerList.size();

            //check if duplicate or not 
            if (i>0 && nums[i]==nums[i-1]) {
                start = end + 1;
            }
 
            end = outerList.size()-1;
          
            //traverese and addd the number to the existing subsets 
            //with cloning the previous memebers
            for (int j = start; j < n; j++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(j));
                innerList.add(number);
                outerList.add(innerList);

            }

            }
            return outerList;

    }
}
