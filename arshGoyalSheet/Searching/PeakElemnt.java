package arshGoyalSheet.Searching;

public class PeakElemnt {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,5,6,4} ;
        int peak = findPeak(nums);
        System.out.println(peak);
    }

    static int findPeak(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while (start<end) {
            int mid = start + (end - start)/2;

            if (nums[mid + 1] > nums[mid]) {
                start=mid+1;
            }else{
                end =mid;
            }
        }
        return start;
    }
}
