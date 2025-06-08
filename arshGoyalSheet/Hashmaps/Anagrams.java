package arshGoyalSheet.Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list = groupAnagrams(strs);
        System.out.println(list);
    }

    static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sortedStr = new String(arr);

            if (map.containsKey(sortedStr)) {
                map.get(sortedStr).add(strs[i]);
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(sortedStr, temp);
            }
        }

        for (String key : map.keySet()) {
            list.add(map.get(key));
        }

        return list;
    }
}
