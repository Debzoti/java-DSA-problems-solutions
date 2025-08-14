package arshGoyalSheet.Stack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> mainStack ;
    private Stack <Integer> minStack;
    public MinStack() {

        mainStack = new Stack<>();
        minStack = new Stack<>();

        //queries in form: Input: q = 7, queries = [[1, 2], [1, 3], [3], [2], [4], [1, 1], [4]]

        //handle queries
        // 1. Push x onto the stack.
        // 2. Pop the top element from the stack.
        // 3. Get the top element of the stack.
        // 4. Get the minimum element in the stack.
    }

    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }else{
            minStack.push(minStack.peek());
        }
        
    }

    // Remove the top element from the Stack
    public void pop() {
        
        // code here
        mainStack.pop();
        minStack.pop();
    }

    // Returns top element of the Stack
        
    public int peek() {
        // code here
        return mainStack.peek();
    }

        
    // Finds minimum element of Stack
    public int getMin() {
        // code here
        return minStack.peek();
    }
}
