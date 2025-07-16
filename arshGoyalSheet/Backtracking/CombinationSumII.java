package arshGoyalSheet.Backtracking;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumII {
    public static void main(String[] args) {
        int [] nums = {10,1,2,7,6,1,5};
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        findCombinatons(nums,8,0,0,path,res);
        System.out.println(res);
    }

    static void findCombinatons(int[] candidates, int target, int startIndex, int tempSum,List<Integer> list,List<List<Integer>> res){
        //base condition
        if ( tempSum == target) {
            res.add(new ArrayList<>(list));
            return;
        }

        //loop for logic
        for (int i = startIndex; i < candidates.length; i++) {
            //handle duplicates
            if (i>startIndex && candidates[i] == candidates[i-1]) {
                continue;
            }
            
            tempSum+=candidates[i]; // you can also pass tempsum as fresh without adding value
            if (tempSum > target) {
                break;
            }
            list.add(candidates[i]);
            findCombinatons(candidates, target, i+1, tempSum, list,res);
            //backtrack
            tempSum-=candidates[i]; // hence this line is not needeed so efficient
            list.remove(list.size()-1);
        }
        


    }
}
