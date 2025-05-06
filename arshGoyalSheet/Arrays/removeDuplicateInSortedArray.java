package arshGoyalSheet.Arrays;

public class removeDuplicateInSortedArray {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int  ans = removeDuplicates(arr);
        System.out.println(ans);
    }

    static int removeDuplicates(int[] nums){
      int idx = 1;
      int nextUnique = 1;
      while (idx<nums.length) {
          if (nums[idx] != nums[nextUnique - 1]) {
              nums[nextUnique] = nums[idx];
              nextUnique++;
          }
          idx++;
      }
    //   for (int i : nums) {
    //     System.out.println(nums[i]);
    //   }
    return nextUnique;
    }
    // 0, 1, 2, 3

}