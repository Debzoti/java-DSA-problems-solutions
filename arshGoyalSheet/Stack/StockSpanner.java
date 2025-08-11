package arshGoyalSheet.Stack;

import java.util.Stack;

public class StockSpanner {

    //a global stack to store pair of index and val
    Stack<int[]> s ;
    // 0--> index of the stock price
    // 1--> value of the stock price
    public StockSpanner(){
        s = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        while (s.size() > 0 && s.peek()[1] <= price) {
            span += s.peek()[0];
            s.pop();
        }
        s.push(new int[]{span, price});
        if (s.size() == 1) {
            return span;
        }

        return span;
    }
}
