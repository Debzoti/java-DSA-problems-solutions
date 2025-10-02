package arshGoyalSheet.Maths;

public class WaterBottlesII {
    public static void main(String[] args) {
        System.out.println(maxBottlesDrunk(13, 6));
    }

    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int drinks = numBottles, empties = numBottles ;

        while (empties >= numExchange) {
            empties-=numExchange;
            drinks ++;
            empties++;
            numExchange++;
        }

        return drinks;
    }
}
