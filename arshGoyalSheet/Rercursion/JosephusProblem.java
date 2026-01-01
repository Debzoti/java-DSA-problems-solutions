package arshGoyalSheet.Rercursion;
import java.util.*;
public class JosephusProblem {
    public static void main(String[] args) {
        int n = 7, k = 3, start = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i<n ; i++){
            res.add(i + 1);
        }
        System.out.println(survivor(n,k-1,start,res));
    }

    static int survivor(int n, int k, int start, ArrayList<Integer> res){
        //base case
        if(res.size() ==1) return res.get(0);

        int idx = (start + k) % res.size();
        res.remove(idx);
        
       return survivor(n,k,idx,res);
    }
}
