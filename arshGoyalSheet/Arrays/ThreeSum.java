package arshGoyalSheet.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
public class ThreeSum {
    public static void main (String[] args) {
        int[] nums = {0,1,1};
        System.out.println(threeSum(nums));
    }

    static ArrayList<ArrayList<Integer>> threeSum(int[] nums){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // sort the array tio cstch duplicates

        for (int i = 0; i < nums.length -2; i++) { //ignoring last two elements for the poinrers
            //setup pointers
            int left = i + 1;
            int right = nums.length - 1;
            
            if(i>0 && nums[i]==nums[i-1]) continue; // skip duplicates

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==0){
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    //skip duplicates
                    while(nums[left]==nums[left+1] && left<right) left ++;
                    while(nums[right]==nums[right-1] && left<right) right --;
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return res;
    }
}
