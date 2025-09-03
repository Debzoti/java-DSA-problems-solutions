package arshGoyalSheet.Strings;

public class LongestPalindromeSubstring {

    //makr it recursive tomorrow
    public static void main(String[] args) {
        String str = "babcdcb";
        System.out.println(longestPalindrome(str));
    }

    public  static  String longestPalindrome(String s) {
        int start = 0;
        int maxLen = Integer.MIN_VALUE;
        int left =0, right =0;
        //traverse center of  palinndromes
        for (int center = 0; center < s.length(); center++) {
            //even plaindromes
            left =center;
            right = center + 1;
            while (left>0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
                //found a palindrome store an compare
                if (right - left +1 > maxLen) {
                    maxLen= right-left+1;
                    start = left; //storing coz we need to return this
                }
                left --;
                right ++;
            }

                //odd plaindromes
                left =center;
                right = center ;
                while (left>0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
                    //found a palindrome store an compare
                    if (right - left +1 > maxLen) {
                        maxLen= right-left+1;
                        start = left; //storing coz we need to return this
                    }
                    left --;
                    right ++;
                }
        }

        String res = s.substring(start, start+maxLen );
        return res;
    }
}
    