package arshGoyalSheet.BitManipulation;

public class MinKBitFlips {
    public static void main(String[] args) {
        int arr[] = {0,1,0}, k = 1;
        System.out.println(minKBitFlips(arr, k));
    }

    public static int minKBitFlips(int[] nums, int k) {
        int n = nums.length, fc = 0, res = 0;
        boolean[] isFlipped = new boolean[n];

        for(int i = 0; i < n; i++){
            if(i >= k && isFlipped[i - k]){
                fc--;
            }

            if(nums[i] == 0 && fc % 2 == 0 || 
                nums[i] == 1 && fc % 2 == 1){
                    if(i+k > n) return -1;
                    isFlipped[i] = true;
                    fc++;
                    res++;
            }
        }
        return res;
    }
}
