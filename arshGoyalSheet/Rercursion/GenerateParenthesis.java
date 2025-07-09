package arshGoyalSheet.Rercursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    static List<String> generateParenthesis(int n ){
       
        List<String> res = new ArrayList<>();
        handler(new StringBuilder(),0,0,n,res);
       return res;
    }

    static void handler(StringBuilder sb, int open, int close, int limit,List<String> res){
    //     //base case
    //     if (open ==limit && close == limit) {
    //         List<String> list = new ArrayList<>();
    //         list.add(curr);
    //         return list;
    //     }

    //     if(open<limit) {
    //         List<String> first = handler(curr + "(", open+1, close, limit);
    //         res.addAll(first);
    //     }
    //     if(close<open) {
    //         List<String> second = handler(curr + ")", open, close+1, limit);
    //         res.addAll(second);
    //     }

    //    return res;



    //bactrack with pass by reference using stringbuilder
    if (open == limit && close == limit) {
        res.add(sb.toString());
        return;
    }

    if (open < limit) {
        sb.append('(');
        handler(sb, open + 1, close, limit, res);
        sb.deleteCharAt(sb.length() - 1); // backtrack
    }

    if (close < open) {
        sb.append(')');
        handler(sb, open, close + 1, limit, res);
        sb.deleteCharAt(sb.length() - 1); // backtrack
    }

    }
}
