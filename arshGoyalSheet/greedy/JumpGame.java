package arshGoyalSheet.greedy;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,5,8,1,7};
        System.out.println(canJump(nums));
    }

    static Boolean canJump(int[] nums){
        int maxReach = 0;
        for(int i =0; i<nums.length; i++){
            //when to stop when its stuck
            if(i>maxReach) return false;
            maxReach = Math.max(maxReach,i+nums[i]);
            if(maxReach>=nums.length - 1) return true;
        }
        return false;
    }
}
