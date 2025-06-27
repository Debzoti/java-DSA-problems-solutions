package kunalKuswahaSolutions.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequences {
    public static void main(String[] args) {
       //subsequences("","abc");
       System.out.println(subsequencesReturn("","abc"));

    }
    static void subsequences(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subsequences(p+ch, up.substring(1));
        subsequences(p, up.substring(1));

    }
    static List<String> subsequencesReturn(String p, String up){
        if (up.isEmpty()) {
           List<String> ans = new ArrayList<>();
           ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);
        List<String> first = subsequencesReturn(p+ch, up.substring(1));
        List<String> second = subsequencesReturn(p, up.substring(1));

        first.addAll(second);
        return first;
    }
}