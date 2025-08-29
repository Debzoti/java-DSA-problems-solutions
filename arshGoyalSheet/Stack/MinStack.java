package arshGoyalSheet.Stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> s ;
    int min;

    public MinStack() {
        s = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    // Add an element to the top of Stack
    public void push(int x) {
        if (s.isEmpty()) {
            s.push(x);
            min = x;
        }else{
            if (x >= min) {
                s.push(x);
            } else {
                s.push(2*x - min);
                min = x;
            }
        }

    }

    // Remove the top element from the Stack
    public void pop() {
        if (s.isEmpty()) {
            return;
        }

        if (s.peek() < min) {
            min = 2*min - s.peek();
            s.pop();
        } else {
            s.pop();
        }
    }

    // Returns top element of the Stack
        
    public int top() {
        // code here
        if (s.isEmpty()) {
            return -1;
        }

        if (s.peek() < min) {
            return 2*min - s.peek();
        }

        return s.peek();
    }

        
    // Finds minimum element of Stack
    public int getMin() {
        // code here
        return min;
        
    }
}
