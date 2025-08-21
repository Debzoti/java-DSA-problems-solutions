package arshGoyalSheet.Stack;

import java.util.Stack;

public class SortStack {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        Stack<Integer> newStack = new Stack<>();
        while (!s.isEmpty()) {
            int temp = s.pop();
            //chcek and add min elemnts and pop biggeree lments 
            while (newStack.isEmpty() && temp < newStack.peek()) {
                s.push(newStack.pop());
            }
            newStack.push(temp);
        }
        
        return newStack;
    }
}
