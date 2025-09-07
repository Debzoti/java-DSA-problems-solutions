package arshGoyalSheet.Maths;

public class MinOperations {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(minOperations(nums));
    }

    public static int minOperations(int[] nums) {
        int n = nums.length;  
        
        //find global And ans use this to equalize all elements
        int globalAnd = nums[0];
        for(int i=1; i<n; i++){
            globalAnd = globalAnd & nums[i];    
        }

        int count =0;
        int i =0;
        // for(int i=0; i<n; i++){
        //     int curr = nums[i];
        //     while(curr != globalAnd){
        //         curr = curr >> 1;
        //         count++;
        //     }
        // }

        while (i < n) {
            if (nums[i] != globalAnd) {
                count++;
                while (i < n && nums[i] != globalAnd) {
                    i++;
                }
            }else {
                i++;
            }
        }
        return count;
    }
}
