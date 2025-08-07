package arshGoyalSheet.DP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class WordBreak {
     public static int wordBreak(String A, ArrayList<String> B) {
        Set<String> dict = new HashSet<>(B);
        Integer[] memo = new Integer[A.length()];
        // if we get to strin g end
        int res = canBreak(dict,A,0,memo);
        return res;
        
     }

    public static int canBreak(Set<String> dict,String str, int start, Integer[] memo){
        //if reach to las of  string we return 1
        if(start == str.length()) return 1;
        //in calls check if uts already done if yes return from here
        if(memo[start]!=null) return memo[start];

        for (int end = start + 1; end <= str.length(); end++) {
            String prefix = str.substring(start, end);
            if (dict.contains(prefix)) {
                //go further 
                if(canBreak(dict, str, end, memo) == 1){
                    memo[start] = 1;
                    return 1;
                }
            }
        }
        //if all fails to find set meme to 
        memo[start]=0;
        return 0;
    }
}
