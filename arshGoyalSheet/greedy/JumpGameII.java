package arshGoyalSheet.greedy;

public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(jump(nums)); 
    }

    public static int jump(int[] nums) {
        // return solve(nums, 0, 0);
        
        //use greedy choose farthesr or max distance we can cover i eac range
        int l=0,r=0,jump =0,farthest=0;
        
        while (r<nums.length-1) {
            
            for (int i = l; i <= r; i++){
                farthest+=Math.max(farthest, i + nums[i]);
            }

           if (nums[farthest] == 0 && farthest < nums.length - 1) {
                return -1;
            
           }
            if(farthest == r){
                return -1;
            }
            
            jump++;
            l = r + 1; //gint to next ramge
            r = farthest;
        }
        return jump;
    }
    
    
    
    
    //brute force using rceussrion
    //dfs solution 
    // static int solve(int[] nums, int index, int jumpLen ){
    //     //when to stop
    //     if (index >= nums.length -1) {
    //         return jumpLen;
    //     }

    //     int min = Integer.MAX_VALUE;

    //     for (int i = 1; i <= nums[index]; i++) {
    //         if ((index + i) < nums.length) {
                
    //             min = Math.min(min, solve(nums, index + i, jumpLen + 1));
    //         }
    //     }

    //     return min;
    // }
}
