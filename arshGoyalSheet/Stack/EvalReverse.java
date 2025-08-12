package arshGoyalSheet.Stack;

import java.util.Stack;

public class EvalReverse {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        //loop to traverse all tokens
        for (String token : tokens) {
            //if token is a number, push it to stack
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                stack.push(Integer.parseInt(token));
            } else {
                //if token is an operator, pop two numbers from stack
                int b = stack.pop();
                int a = stack.pop();
                
                //perform the operation and push the result back to stack
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push((int)a / b);
                        break;
                }
            }
        }
        return stack.pop(); //the final result will be the only element left in the stack
    }
}
