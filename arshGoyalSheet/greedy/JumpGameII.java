package arshGoyalSheet.greedy;

public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums)); 
    }

    //brute force using rceussrion
    public static int jump(int[] nums) {
        return solve(nums, 0, 0);
    }

    static int solve(int[] nums, int index, int jumpLen ){
        //when to stop
        if (index >= nums.length -1) {
            return jumpLen;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= nums[index]; i++) {
            if ((index + i) < nums.length) {
                
                min = Math.min(min, solve(nums, index + i, jumpLen + 1));
            }
        }

        return min;
    }
}
