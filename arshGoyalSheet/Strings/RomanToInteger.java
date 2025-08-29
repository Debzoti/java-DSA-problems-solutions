package arshGoyalSheet.Strings;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String no = "XIX";
        System.out.println(romanToInt(no));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        /*          
        build the map
            I             1
            V             5
            X             10
            L             50
            C             100
            D             500
            M             1000
 */
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        char[] charArr = s.toCharArray();
        int res =0;
        int lastVal = 0, curr = 0;
        for (int i = charArr.length - 1; i >= 0 ; i--) {
            curr = map.get(charArr[i]);
            //what if
            if (lastVal > curr) {
                res -= curr;
            }else{
                res+= curr;
            }
            lastVal=curr;
        }
        return res;
    }
}
