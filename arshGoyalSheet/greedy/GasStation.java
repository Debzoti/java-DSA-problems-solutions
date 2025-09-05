package arshGoyalSheet.greedy;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2}; 
        System.out.println(canCompleteCircuit(gas, cost));
        
    }

    public static  int canCompleteCircuit(int[] gas, int[] cost) {
        
        int tank =0, surplus =0, start =0;
        
        for (int i = 0; i < gas.length; i++) {
            //starting point mst be hwere gas>cost if tak oges negetive before all index
            //are invailid we must strat after it

            tank += gas[i] - cost[i];
            surplus += gas[i] - cost[i];

            if (tank < 0) {
                tank =0; //stat from after the index
                start = i + 1; //store the index
            }
        }

        return surplus >= 0 ? start : -1;

    }
}