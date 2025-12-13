package arshGoyalSheet.BitManipulation;

public class FindDiff {
    public static void main(String[] args) {
        String s = "abcd", t ="abcde";
        System.out.println(findTheDifference(s,t));
    }

    public static char findTheDifference(String s, String t) {
        char res = 0;
        for(char c: s.toCharArray()) {
            res = (char)(res ^ c);
        }

        for(char d : t.toCharArray()){
            res ^= d;
        }

        return res;
    }
}
