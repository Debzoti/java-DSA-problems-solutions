package arshGoyalSheet.Strings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] arr = {"aba", "acb", "baa"};
        System.out.println(groupAnagrams(arr));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        //travesre it and sort each string add to map 
        for (String str : strs) {
            char[] sortedStr = str.toCharArray();
            Arrays.sort(sortedStr);
            String key = new String(sortedStr); //convert this to string
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);

        }
        return new ArrayList<>(map.values());
    }
}
