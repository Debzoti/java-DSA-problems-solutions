package arshGoyalSheet.Backtracking;

import java.util.ArrayList;

public class PhoneDIgitWords {

    static String[] map = {
        "",    // 0
        "",    // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6bravebbrbb
        "pqrs",// 7
        "tuv", // 8
        "wxyz" // 9
    };
    
    public static void main(String[] args) {
        int[] arr = {8,8,1};
        System.out.println(possibleWords(arr));
    }
    public static ArrayList<String> possibleWords(int[] arr) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        
        dfs(arr,0,"",res);
        return res;
    }

    public static void dfs(int[] arr, int index, String curr,  ArrayList<String> res ){
        //base case
        if (index == arr.length) {
            res.add(curr);
            return;
        }
        
        String letters = map[arr[index]];

        //handle 1 and other chars 
        if (letters.equals("")) {
            dfs(arr, index+1, curr, res);
            return;
        }
        
        for (char ch : letters.toCharArray()) {
            dfs(arr, index + 1, curr + ch, res);
        }

    }
}

