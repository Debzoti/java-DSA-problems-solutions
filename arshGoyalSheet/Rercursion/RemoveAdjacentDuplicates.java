package arshGoyalSheet.Rercursion;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String up = "aaa"; //cymueammmadhcwpvpf
        String result = removeUtil(up);
        System.out.println(result);
    }

    public static String removeUtil(String s) {
        StringBuilder res = new StringBuilder();
        int i =0;
        while(i<s.length()){
            char ch = s.charAt(i);
            int j = i;
            // skip dupiates tackl in variable
            while (j < s.length() && s.charAt(j) == ch) {
                j++;
            }
            int dupRange = j-i;
            //if there only one lement 
            if (dupRange % 2 == 1) {
                if ( res.length() >0 && res.charAt(res.length()-1)  == ch) {
                    res.deleteCharAt(res.length() - 1);
                } else {
                    res.append(ch);
                }
            }
            i=j;
        }
        return res.toString();
    }

    public static String handler(String p, String up) {
        // base case
        if (up.isEmpty()) {
            return p;
        }

        char ch = up.charAt(0);

        if (!p.isEmpty() && p.charAt(p.length() - 1) == ch ) {
            // remove last char from processed
            p = p.substring(0, p.length() - 1);
            // skip this char as well, but re-check with new p and rest of up
            return handler(p, up.substring(1));
        }

        // otherwise, add char and move forward
        return handler(p + ch, up.substring(1));
    }
}
