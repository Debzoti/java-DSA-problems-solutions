package arshGoyalSheet.Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NGR {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50};
        ArrayList<Integer> ans = new ArrayList<>();
        ans = getNextGreater(arr);
        System.out.println(ans);
    }

    static ArrayList<Integer> getNextGreater(int[] arr){
        Stack <Integer> s = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = arr.length -1 ; i >= 0; i--) {
            if (s.empty()) {
                res.add(-1);
            }else if(s.size()>0 && s.peek() > arr[i]){
                res.add(s.peek());
            }else{
                while(s.size() > 0 && s.peek() <= arr[i]){
                    s.pop();
                }

                if (s.size() == 0) {
                    res.add(-1);
                } else {
                    res.add(s.peek());
                }
            }
            s.push(arr[i]);
        }
         ArrayList<Integer> revRes = new ArrayList<>(res.reversed());
         return revRes;
    }
}
