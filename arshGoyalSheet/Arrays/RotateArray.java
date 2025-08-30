package arshGoyalSheet.Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr ));
    }

    //do it without using extra space

    public static void rotate(int[] nums, int k) {
        int n =nums.length;
        k = k % n;

        //rverse whole arr
        reverse(nums, 0, n-1);
        //rveerse front part upto k -1
        reverse(nums, 0, k-1);
        //rverse remianing part
        reverse(nums, k, n-1);

    }

    static void reverse(int[] arr, int i, int j){
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
