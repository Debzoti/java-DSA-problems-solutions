package arshGoyalSheet.Hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int [] res = twoSum(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    static int [] twoSum(int[] nums, int target){
        // Arrays.sort(nums);; // sort the array to use two pointer approach
        // // //8 wromg approacgh becoz it changes indices i have to show indices fromn previous array 
        // //two pointer approach
        // int left = 0;
        // int right = nums.length - 1;
        // int[] result = new int[2];
        // while (left < right) {
        //     int sum = nums[left] + nums[right];
        //     if (sum == target) {
        //         result[0] = left;
        //         result[1] = right;
        //         return result;
        //     } else if (sum < target) {
        //         left++;
        //     } else {
        //         right--;
        //     }
        // }
        // if (result[0] == 0 && result[1] == 0) {
        //     //System.out.println("No two numbers add up to the target.");
        //     return new int[0]; // Return an empty array if no solution is found
            
        // }
        // return result;


        // using hashmap approach
        int [] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                result[0] = map.get(comp);
                result[1] = i;
                return result;
            }else {
                map.put(nums[i], i);
            }
        }
        //System.out.println("No two numbers add up to the target.");
        return new int[0]; // Return an empty array if no solution is found

    }
}
