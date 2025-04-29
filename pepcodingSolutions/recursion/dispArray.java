package pepcodingSolutions.recursion;

public class dispArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        display(arr, 0);
    }

    static void display(int[] arr, int idx) {
        //base case
        if (idx == arr.length) return;

        //faith
        System.out.println(arr[idx]);
        //recursive call
        display(arr, idx + 1);
    }
    
}
