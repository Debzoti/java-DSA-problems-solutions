package arshGoyalSheet.greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyStore {
    public static void main(String[] args) {
        int[] prices = {9 ,13 ,4 ,17 ,7 ,13};
        int k = 1;

        System.out.println(minMaxCandy(prices, k));
    }

    public static ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here

        //but 1 get 1 free and agin buy 1 get 1 free
        Arrays.sort(prices);
        int maxPrices = 0, minPrices = 0;
        int n = prices.length;
        ArrayList<Integer> ans = new ArrayList<>();

        if (k >= n) {
            ans.add(0);
            ans.add(0);
            return ans;
        }

        //min prices
        int l = 0, r = n - 1;
        while (l <= r) {
            minPrices += prices[l];
            l++;
            r -= k;
        }

        //max prices
        l = 0;
        r = n - 1;
        while (l <= r) {
            maxPrices += prices[r];
            r--;
            l += k;
        }

        ans.add(minPrices);
        ans.add(maxPrices);
        return ans;
    }
}
