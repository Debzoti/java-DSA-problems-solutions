package arshGoyalSheet.Arrays;

public class buysellStock {

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1   };
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices){
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }
}