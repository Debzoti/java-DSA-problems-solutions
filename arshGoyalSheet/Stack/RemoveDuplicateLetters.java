package arshGoyalSheet.Stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String str = "cbacdcbc";
        System.out.println(
            removeDuplicateLetters(str)
        );
    }

    public static String removeDuplicateLetters(String s) {
        //couunt the frequencies
        HashMap<Character,Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch, 0) + 1 );
        }

        HashSet<Character> isPresent = new HashSet<>();
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            //decrease thefreq
            map.put(ch, map.get(ch) - 1);

            //continue if its arady in stack
            if (isPresent.contains(ch)) {
                continue;
            }

            //pop only when ch freq>0 and peek > ch
            while (!st.isEmpty() && st.peek() > ch && map.get(st.peek()) > 0) {
                char temp = st.pop();
                isPresent.remove(temp);
            }

            //else push and add to set
            st.push(ch);
            isPresent.add(ch);

        }
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
