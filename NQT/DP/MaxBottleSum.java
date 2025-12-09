package NQT.DP;
import java.util.*;



public class MaxBottleSum {
    public static void main(String[] args){
        // 2 liime inpputs first size of length and other is arrray elements 
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[size];
        String line = sc.nextLine();
        String[] val = line.trim().split("\\s+");
        for(int i =0; i<size; i++){
            arr[i] = Integer.parseInt(val[i]);
        }
       // System.out.println(arr);
        sc.close();


        //logic hre
        /*
            5 2 7 3 we have to find the max sum from each throw 
            we hvae to fuind the max sum of the product 
            if we choose 2 sum += 5*2*7 and so in if out of bounds mul 1 to eaxch of them
            */


        //store arr into an arraylIst add1 in start and beggining 
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr){
            list.add(num);
        }
        list.addFirst(1);
        list.addLast(1); //for safe bounds 


        int mid = list.size()/2;
        int left = mid, right = mid+1;
        long sum = 0;

       

        System.out.println(sum);
    }
}
