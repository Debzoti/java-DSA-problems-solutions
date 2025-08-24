package arshGoyalSheet.Rercursion;

import java.util.ArrayList;
import java.util.HashSet;

public class StringPermutations {
    public static void main(String[] args) {
        String str = "ABB";
        ArrayList<String> res = findPermutations(str);
        System.out.println(res);

    }

    static ArrayList<String> findPermutations(String str){
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str);
        dfs(sb,0,list);
        return list;
    }

    static void dfs(StringBuilder sb, int index, ArrayList<String> res){
        //base condition
        if (index == sb.length() - 1) {
            res.add(sb.toString());
            return;
        }

        HashSet<Character> used = new HashSet<>();

        //hypothesis
        for (int i = index; i < sb.length(); i++) {
            
            char ch = sb.charAt(i);
            if (used.contains(ch)) {
                continue;
            }
            used.add(ch);


            swap(sb,index,i);
            dfs(sb, index +1, res);
            swap(sb,index,i);
            
        }
    }

    static void swap(StringBuilder sb, int i, int j){
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }
}
