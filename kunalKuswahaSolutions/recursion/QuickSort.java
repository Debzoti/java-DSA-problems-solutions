package kunalKuswahaSolutions.recursion;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 4, 3};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //programiz approach
    // static void quickSort(int[] arr, int low, int high){
    //     if (low<high) {
    //         int pIndex = partition(arr,low,high);

    //         quickSort(arr,low,pIndex-1);
    //         quickSort(arr,pIndex+1,high);

    //     }
    // }
    // static int partition(int[] nums, int low, int high){
    //     int pivot = high;
    //     int pointer = low - 1;

    //     for (int i = low; i < high; i++) {
    //         if (nums[i]<=nums[pivot]) {
    //             pointer++;
    //             swap(nums,i,pointer);
    //         }
    //     }
    //                 //swap pivot to its correct positon
    //                 swap(nums,pointer+1,pivot);
    //                 return pointer+1;
    // }
    static void swap(int[] a, int p, int q ){
        int t = a[p];
        a[p]=a[q];
        a[q]=t;
    } 

    //kunals approach (easy and explainable)
    static void quickSort(int[] nums, int low, int high){
        //base case
        if (low>=high) {
            return;
        }
        int start = low;
        int end = high;
        int pivot = start+(end-start)/2; //chooose pivot as middle element
        while (start<=end) {
            
        while (nums[start]<nums[pivot]) {
            start++;
        }
        while (nums[end]>nums[pivot]) {
            end--;
        }

        if (start<=end) { //just to double check start and end
            swap(nums,start,end);
            start++;
            end--;
        }

    }
    quickSort(nums, low, end);
    quickSort(nums, start, high);

    }

}
