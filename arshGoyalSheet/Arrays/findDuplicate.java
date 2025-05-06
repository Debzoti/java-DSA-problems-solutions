package arshGoyalSheet.Arrays;

public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(find(arr));
    }
    static int find(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }else if(i!= correct){ // returns when  we found the duplicate
                return nums[i];
            }else {
                i++;
            }

        }
        // //duplicate after sorting
        // for (int j = 0; j < nums.length; j++) {
        //     if(j!=nums[j]-1){
        //         return  nums[j];
        //     }
        // }
         return nums.length;
    }


    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}
