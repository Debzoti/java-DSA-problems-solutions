package arshGoyalSheet.Backtracking;

import java.util.List;
import java.util.ArrayList;

public class PalindromePartitioning {
    List<List<String>> res = new ArrayList<>();
    public static void main(String[] args) {
        String s = "aab";
        List<String> curr = new ArrayList<>();
        PalindromePartitioning pp = new PalindromePartitioning();
        pp.find(s,0,curr);
        System.out.println(pp.res);
    }

     public  void find(String str, int start , List<String> curr){
        //base casse
        if (start==str.length()) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int end = start; end < str.length(); end++) {
            if(isPalin(str,start,end)){
                curr.add(str.substring(start, end + 1));
                find(str, end+1, curr);
                //backtrack
                curr.remove(curr.size()-1);
            }
        }
    }

    static boolean isPalin(String str, int s, int e){
        //check if its not palin
        while (s<e) {
            if (str.charAt(s)!=str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
