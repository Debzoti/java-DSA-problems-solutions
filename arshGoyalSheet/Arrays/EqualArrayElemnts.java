package arshGoyalSheet.Arrays;

public class EqualArrayElemnts{
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int count = hops(nums);
        System.out.println(count);
    }

    static int hops(int[] nums){
        int ovDiff = 0;
        int min = Integer.MAX_VALUE;
        
        for (int num : nums) {
            min = Math.min(num, min);
        }
        for (int num : nums) {
            ovDiff+= num - min;
        }
        return ovDiff;
    }
}

