package pepcodingSolutions.recursion;

public class dispMax {
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(max(arr, 0));
}
static int max(int[] arr, int idx) {
    //base case
    if (idx == arr.length - 1) return arr[idx];

    //faith
    int max = max(arr, idx + 1);
    //calculate max using faith
    if (arr[idx] > max) {
        return arr[idx];
    } else {
        return max;
    }
}

}
