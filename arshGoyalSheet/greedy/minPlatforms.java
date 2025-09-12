package arshGoyalSheet.greedy;

import java.util.Arrays;

public class minPlatforms {
    public static void main(String[] args) {
        int[] arr ={
            1000, 935, 1100
        };
        int[] dep = {
            1200, 1240, 1130
        };
        System.out.println(minPlatform(arr, dep));
    }

    public static int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int first = 0,second =0, platforms =0, res = 0;
        while (first < arr.length && second < dep.length) {
            
            if(arr[first] <= dep[second]){
                platforms++;
                first++;
            }else{
                platforms--;
                second++;
            }
            res = Math.max(platforms, res);
        }

        return res;
    }
}
