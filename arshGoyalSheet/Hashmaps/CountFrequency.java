package arshGoyalSheet.Hashmaps;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,2,1,3,4};
        System.out.println(countFreq(nums, 1));
    }

    static int countFreq(int[] nums , int target){
        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int n = map.get(nums[i]) + 1;
                map.put(nums[i], n);
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println(map);
        return map.containsKey(target)? map.get(target) : 0 ;
    }
}
