package pepcodingSolutions.recursion;

public class lastOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3};
        System.out.println(lastOcc(arr, 0, 3));
    }

    static int lastOcc(int[] arr, int idx, int x) {
        //base case
        if (idx == arr.length) return -1;

        //faith
        int li = lastOcc(arr, idx + 1, x);
        //calculate using faith
        if (li == -1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return li;
        }
    }
    
}
