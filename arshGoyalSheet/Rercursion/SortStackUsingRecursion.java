package arshGoyalSheet.Rercursion;

import java.util.Stack;

public class SortStackUsingRecursion {
    
     public Stack<Integer> sort(Stack<Integer> s) {
        handler(s);
        return s;
    }
    
    
    public void handler(Stack<Integer> s){
        
        //bc
        if (s.isEmpty()) {
            return ;
        }
    
        //hypothesis
        int temp = s.peek();
        s.pop();
        sort(s); //to srt the remainig part
    
        //induction
        insert(s,temp);
    }
     public void insert(Stack<Integer>s, int temp){
        //base condition
        if (s.isEmpty() || s.peek()<=temp) {
            s.push(temp);
            return;
        }

        //hypo
        int val = s.peek();
        s.pop();
        insert(s, temp);

        //induction
        s.push(val);
     }

}
