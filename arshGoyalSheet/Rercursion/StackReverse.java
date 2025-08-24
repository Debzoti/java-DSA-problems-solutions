package arshGoyalSheet.Rercursion;

import java.util.Stack;

public class StackReverse {
     static void reverse(Stack<Integer> st) {
        // code here
        //base condition 
        if (st.isEmpty()) {
            return;
        }

        int temp = st.peek();
        st.pop();
        reverse(st);

        insert(st,temp);
    }

    static void insert(Stack<Integer> st, int temp){
        //base condition
        if (st.isEmpty()) {
            st.push(temp);
            return;
        }

        int val = st.peek();
        st.pop();
        insert(st, temp);

        st.push(val);
    }
}
