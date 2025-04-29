package pepcodingSolutions.recursion;

public class firstOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3,5};
        System.out.println(firstOccurenceInArray(arr, 0, 5));
    }

    static int firstOccurenceInArray(int[] arr, int idx, int x) {
        //base case
        if (idx == arr.length) return -1;

        //faith
        if (arr[idx] == x) {
            return idx;
        } else {
            //recursive call
            return firstOccurenceInArray(arr, idx + 1, x);
        }
    }
}
