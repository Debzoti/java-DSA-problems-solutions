package arshGoyalSheet.Backtracking;

import java.util.List;
import java.util.ArrayList;

public class Lexico {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int n = 13;
        dfs(1,n,list);
        System.out.println(list);
    }

    static void dfs(int number, int limit, List<Integer> res){
        if (number>limit) {
            return;
        }
        res.add(number);
        dfs(number*10,limit,res);
        if (number % 10 != 9) {
            dfs(number + 1,limit, res);
        }
    }
}
