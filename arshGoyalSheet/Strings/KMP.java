package arshGoyalSheet.Strings;

import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
        String str = "abcaabcabd";
        String pattern = "abd";
        System.out.println("pattern found at index " + kmpSearch(str, pattern));
    }

    public static int kmpSearch(String str, String pattern) {
        int[] lps = new int[pattern.length()];
        int i = 0, j = 0;
        lps = buildLPS(pattern);
        System.out.println(Arrays.toString(lps));
        int m = pattern.length(), n = str.length();

        while (i < n) {
            if (str.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == m) {
                    return i - j;
                }
            } else if (j != 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
        return -1;
    }

    static int[] buildLPS(String patt) {
        int m = patt.length();
        int ptr = 1, len = 0;
        int[] lps = new int[m];
        lps[0] = 0;

        while (ptr < m) {
            if (patt.charAt(ptr) == patt.charAt(len)) {
                len++;
                lps[ptr] = len;
                ptr++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[ptr] = 0;
                    ptr++;
                }
            }
        }
        return lps;
    }

}