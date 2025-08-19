package arshGoyalSheet.DP;

import java.util.HashMap;

public class PartitionEqualSubsetSum {

    public static void main(String[] args) {
        int[] nums = {2,2,3,5};
        System.out.println(canPartition(nums)); 
    }


   static  HashMap<String,Boolean> map = new HashMap<>();
    public static boolean canPartition(int[] nums) {
        int ps =0;
        for (int num : nums) {
            ps+=num;
        } 

        if (ps % 2 != 0) {
            return false;
        }

        int target = ps/2;

        // Boolean[][] memo = new Boolean[nums.length][target + 1];
        return dfs(nums,0,0,target);
    }

    public static boolean dfs(int[] nums, int start, int currSum, int target){

        if(currSum == target) return true;

        if(start == nums.length - 1 || currSum > target ) return false;

        // for (int i = start; i < nums.length; i++) { // no need we dont want every possibile subsets
        // }


        //if we reach the path return it
        String key = start + "->" + currSum;
        if (map.containsKey(key)) {
            return map.get(key);
        }

        //add the start element
        currSum+=nums[start];
        if (dfs(nums, start + 1, currSum, target)) {
            map.put(key, true);
            return true;
        }
        currSum-=nums[start];

        //skip it
        boolean res = dfs(nums, start + 1, currSum, target);
        map.put(key, res);

        return res;
    }
}
