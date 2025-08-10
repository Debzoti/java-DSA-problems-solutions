package arshGoyalSheet.Backtracking;

import java.util.Arrays;


public class PartitionKSubsets {
    public static void main(String[] args) {
        int[] arr = {4,3,2,3,5,2,1};
        int k =5;
        boolean ans =isKPartitionPossible(arr,k);
        System.out.println(ans);
    }
    public static boolean isKPartitionPossible(int[] arr, int k) {
        // Your code here
        int reqSum =0;
        boolean[] visited = new boolean[arr.length];
        int[] subset = new int[arr.length/k +1];
        for (int e : arr) {
            reqSum+=e;
        }
        if (reqSum%k!=0) {
            return false;
        }
        reqSum=reqSum/k;
        Arrays.sort(arr);
        //reverse the array
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return dfs(arr,subset,0,reqSum,visited,k);
    }

    static boolean dfs(int[] arr, int[] subset, int currSum, int reqSum, boolean[] visited, int k){
        //base case
        if (k==1) {
            return true;
        }

        //if sum reaches
        if (currSum == reqSum) {
          return dfs(arr, subset, 0, reqSum, visited, k-1); // go for other subsets
        }

        //loop to check subsets
        for (int i = 0; i < arr.length; i++) {
            //handle duplicates]
            if (i>0 && arr[i-1] == arr[i] && !visited[i-1] ) {
                continue;
            }
            if(!visited[i] && currSum<=reqSum){
                currSum+=arr[i];
                visited[i]=true;
                //go further deep
                if (dfs(arr, subset, currSum, reqSum, visited, k)) {
                    return true;
                }
                
                            //backtrcak if nothiings work
                            currSum-=arr[i];
                            visited[i] = false;
            }
        }
        return false;
    }
}
