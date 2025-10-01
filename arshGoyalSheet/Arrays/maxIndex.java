package arshGoyalSheet.Arrays;

public class maxIndex {
    public static void main(String[] args) {
        int[] arr = {18, 17};
        
        System.out.println(maxIndexDiff(arr));
    }

    static int maxIndexDiff(int arr[]) {
        // code here
        int n = arr.length;
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];
        
        //fill and preprocess leftmin
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(arr[i], leftMin[i-1]);
        }

        //fill rightmax
        rightMax[n-1] = arr[n-1];
        for (int j = n-2; j >= 0; j--) {
            rightMax[j]= Math.max(arr[j], rightMax[j+1]);
        }
        
        
        int first = 0, second = 0, maxDiff = -1;
        
        while(first < n && second < n){
            if (leftMin[first] <= rightMax[second]) {
                maxDiff = Math.max(maxDiff, second - first);
                second ++;
            } else {
                first ++;
            }
        }

        return maxDiff;
    }
}
