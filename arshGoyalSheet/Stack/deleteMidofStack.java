package arshGoyalSheet.Stack;

import java.util.Stack;

public class deleteMidofStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        for (int i = 1; i <5; i++) {
            st.push(i);
        }

        deleteMid(st);
        
        for (int n : st) {
            System.out.println(n);
        }
    }
    
    public static void deleteMid(Stack<Integer> s) {
        // code here
        if (s.isEmpty()) {
            return;
        }
        int k = (s.size() / 2) +1;
        
        solve(s,k);
    }

    public static void solve(Stack<Integer> st, int k){
        //base 
        if(!st.isEmpty() && k ==1){
            st.pop();
            return;
        }

        //hyptothris
        int temp = st.peek();
        st.pop();
        solve(st,k-1);

        //induction
        st.push(temp);
    }
}
