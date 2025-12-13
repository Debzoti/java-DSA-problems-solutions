package arshGoyalSheet.BitManipulation;

public class MinBitFlipToConvertNumber {
    public static void main(String[] args) {
        int a = 3, b = 4;
        System.out.println(minBitFlips(a,b));
    }

    public static int minBitFlips(int a, int b) {
        int res = a^b , count = 0;
        while(res != 0){
            res = res & (res - 1);
            count ++;
        }
        return count;
    }
}
