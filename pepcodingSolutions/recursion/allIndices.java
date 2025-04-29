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
    if(idx == arr.length) {
        //if size is 0 then return empty array
        if(size == 0) {
            return new int[0];
        }
        //create an array of size
        int [] base = new int[size];
        return base;
    }

    //incr the size 
    if(arr[idx]==x) {
        size++;
    }
    //faith
    int [] res = allIndicesInArray(arr, x, idx+1, size);

    //adding index in the array
    if(arr[idx]==x) {
        res[size-1] = idx;
    }
    return res;

   }
}