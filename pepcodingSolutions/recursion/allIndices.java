package pepcodingSolutions.recursion;

public class allIndices {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 6};
        int x = 2;
        int[] ans = allIndicesInArray(arr, x, 0, 0);
        for (int i : ans) {
            System.out.println(i);
        }
    }

   static int[] allIndicesInArray(int[] arr, int x, int idx, int size ){


    //base case
    if(idx == arr.length){
        if (size == 0) {
            return new int[0];
        }
        return new int[size];
    }

    //faith
    if (arr[idx]==x) {
        int[] ans = allIndicesInArray(arr, x, idx+1, size+1);
        ans[size]= idx;
        return ans;
    } else {
       int[] ans = allIndicesInArray(arr, x, idx+1, size);
       return ans;
    }
   }
}