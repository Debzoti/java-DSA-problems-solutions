package arshGoyalSheet.Backtracking;

import java.util.Arrays;

public class LetterTile{
   
    public static void main(String[] args) {
       System.out.println(letterTile("AABB"));
    }

  static int letterTile(String str){
    int res ;
    char[] arr = str.toCharArray();
    Arrays.sort(arr);
    res = solve("",new String(arr));
    return res;
  }

//   static int solve(String p,String up){
//     //base case
//     int count = 0;

//     for (int i = 0; i < up.length(); i++) {
//         char ch = up.charAt(i);

//         if (i>0 && up.charAt(i) == up.charAt(i-1)) {
//             continue;
//         }
//         count+=1;
//         String rem = up.substring(0,i) + up.substring(i+1);
//         count+=solve(p + ch, rem);
//     }
//     return count;
//   }

//using hashmap or hashset


  
}