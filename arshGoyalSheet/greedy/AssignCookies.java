package arshGoyalSheet.greedy;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s ={1,2,3};
        System.out.println(findContentChildren(g,s));
    }
    
    public static  int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cLen = s.length, glen = g.length;
        int l =0, r =0;

        while (l < cLen && r < glen) {
            if (g[r] <= s[l]) {
                r = r+1;
            }
            l = l + 1;
        }
        return r ;
    }


}
