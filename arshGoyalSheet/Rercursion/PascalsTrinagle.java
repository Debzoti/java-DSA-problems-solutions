package arshGoyalSheet.Rercursion;

import java.util.ArrayList;

public class PascalsTrinagle {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(nthRowOfPascalTriangle(n));
    }

    // static ArrayList<Integer> res = new ArrayList<>();
    static ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        //usig 2 list one cotains curresnt result other get prev results from prev results
        ArrayList<Integer> curr = new ArrayList<>();

        curr.add(1);

        if (n==1) {
            return curr;
        }

        //get pre answers
        ArrayList<Integer> prev = nthRowOfPascalTriangle(n - 1);

        for (int i = prev.size() - 1; i > 0; i--) {
            int val = prev.get(i) + prev.get(i - 1);
            curr.add(val);
        }
        curr.add(1);

        return curr;

    }

    // static ArrayList<Integer> handler(int n){
    //     // if (res == null) res = new ArrayList<>();  // initialize fresh
    //     // if (res.isEmpty()) res.add(1);             // first row

    //      if (n==1) {
    //         res.add(1);
    //         return res;
    //     }
        
    //     handler(n-1);
    //     //looop here
    //     for (int index = res.size() - 1; index > 0; index--) {
    //         res.set(index, res.get(index) + res.get(index - 1));
    //     }
    //     res.add(1);
        
    //     return res;
    // }
}
