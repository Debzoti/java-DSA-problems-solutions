package kunalKuswahaSolutions.recursion;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {2,5,1,6,3,8};
        // bubble(arr, arr.length-1, 0);
        selectionSort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }



    static void bubble(int[] arr, int r, int c){

        //base case
        if(r==0) return;
        //if we have traversed the whole row
        if(r>c){
            if (arr[c]>arr[c+1]) {
                swap(arr,c,c+1); // sending the larger element to the right
            }
            bubble(arr, r, c+1); // move to the next column
        }else{
            bubble(arr, r-1, 0); //move the next row
        }
    }

    static void selectionSort(int[] arr, int r, int c, int min){
        //base case
        if(r==0) return;
        
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
