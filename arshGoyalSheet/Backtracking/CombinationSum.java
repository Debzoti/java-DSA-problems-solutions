package arshGoyalSheet.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {8,7,4,3};
        int target = 11;
         Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path =new ArrayList<>();
        find(arr,target,0,0,path,res);
        System.out.println(res);
    }

    static void find(
        int[] candidates, 
        int target, 
        int start, 
        int tempSum, 
        List<Integer>  path, 
        List<List<Integer>> res
        ){
        //base condition
        if ( tempSum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            
            if (candidates[i] > target) {
                continue;
            }
            tempSum+=candidates[i]; // you can also pass tempsum as fresh without adding value
            if (tempSum > target) {
                break;
            }
            path.add(candidates[i]);
            find(candidates, target, i, tempSum, path, res);
            // start+=1; //update unless took previous value multiple times  
            //backtrack
            tempSum-=candidates[i];
            path.remove(path.size()-1);
        }
    }
}
