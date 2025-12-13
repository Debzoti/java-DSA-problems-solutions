package arshGoyalSheet.BitManipulation;

public class MinSuffixFlips {
    public static void main(String[] args) {
        String target = "10111";
        System.out.println(minFlips(target));
    }

    public static int minFlips(String target) {
        int transitions = 0,flipBit = '0';

         for(char ch : target.toCharArray()){
            if(ch != flipBit){
                transitions++;
                flipBit = flipBit == '0' ? '1' : '0';
            }
         }
         return transitions;
    }
}
