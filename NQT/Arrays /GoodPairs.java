public class GoodPairs {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 1, 3};
        int goodPairsCount = countGoodPairs(array);
        System.out.println("Number of good pairs: " + goodPairsCount);
    }

    //if a number ppaers n times so number of good pairs formed is nC2 = n*(n-1)/2
    public static int countGoodPairs(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;    
                }
            }
        }
        return count;
    }
}
