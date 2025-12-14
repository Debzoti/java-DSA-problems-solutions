package arshGoyalSheet.BitManipulation;

public class SingleNumberII {
    public static void main(String[] args) {
        int[] arr ={
            0,1,0,1,0,1,99
        };
        System.out.println(singleNumber(arr));
       
    }

    static int singleNumber(int[] nums){
        int n = nums.length, res = 0;

        for(int bit = 0 ; bit < 32; bit++){
            int bitCount = 0;
            for(int i = 0; i<n; i++){
                bitCount += (nums[i] >> bit) & 1;
            }
            if (bitCount % 3 != 0) {
                res = res | (1 << bit);
            }
        } 
        return res;
    }
}
