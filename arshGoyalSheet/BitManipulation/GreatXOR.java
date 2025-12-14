package arshGoyalSheet.BitManipulation;

public class GreatXOR {
    public static void main(String[] args) {
        System.out.println(findGreat(10));
    }
    static long findGreat(long x){
        long pow2 = 1, count = 0;
        while (pow2 <= x) {
            if ((x & pow2) == 0) {
                count += pow2;
            }

            pow2 *= 2;
        }
        return count;
    }
}
