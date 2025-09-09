package arshGoyalSheet.greedy;

public class LargestInOneSwap {
    public static void main(String[] args) {
        String s = "333"; // 7236
        System.out.println(largestSwap(s));
    }
    public static String largestSwap(String s) {
        // code here
        char[] arr = s.toCharArray();
        int n = arr.length;
        int left = -1, right = -1;
        char maxChar = arr[n - 1];
        int maxIndex = n - 1;

        //get max char from right only
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxChar) {
                maxChar = arr[i];
                maxIndex = i;
            }
        }

            //find first char which is smaller than max char
            //and is to the left of max char
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < maxChar && i < maxIndex) {
                left = i;
                right = maxIndex;
                break;
                
            }
        }
        if (left == -1) {
            return s; // No swap needed, already the largest
        }

        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        return new String(arr);
    }
}
