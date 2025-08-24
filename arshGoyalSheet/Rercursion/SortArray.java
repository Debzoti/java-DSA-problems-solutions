package arshGoyalSheet.Rercursion;

import java.util.ArrayList;

public class SortArray {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        sort(list);;
        System.out.println(list);
    }

    public static void sort( ArrayList<Integer> list ){
        //convert arr inyo list
        // ArrayList<Integer> l = new ArrayList<>();

        //base case
        if (list.size() == 0) {
            return;
        }

        int temp = list.getLast();
        list.removeLast();
        sort( list);

        insert(list,temp);

    
    }

    static void insert(ArrayList<Integer> list, int temp){

        //base condition
        if(list.size() == 0 || temp >= list.getLast()){
            list.add(temp);
            return;
        }

        //hypothesis
        int val = list.getLast();
        list.removeLast();
        insert(list, temp);

        //induction
        list.add(val);

    }
}
