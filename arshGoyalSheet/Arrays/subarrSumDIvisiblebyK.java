package arshGoyalSheet.Arrays;

public class subarrSumDIvisiblebyK {
    static int count ;
    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subArraySum(arr, k));
    }
    static int subArraySum(int[] nums, int k) {
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            isSubArrDIisibleByK(nums, i, 0,k);
        }
        return count;
    }

    static void isSubArrDIisibleByK(int[] nums, int start, int currSum, int k){

        //base case
        if (start == nums.length) {
            return;
        }


        currSum += nums[start]; // takes sum of all elements os subarray including start
        if(currSum % k == 0){
            count++;
        }

        isSubArrDIisibleByK(nums, start + 1, currSum, k); // call the function for next element

    }
}
