package arshGoyalSheet.Hashmaps;

import java.util.HashMap;

public class FfirstUniqChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    static int firstUniqChar(String str){

        HashMap <Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int n = map.get(str.charAt(i)) + 1;
                map.put(str.charAt(i), n);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
        for (int i = 0; i < str.length(); i++) { //chcek which char from  given string is unique in order
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
