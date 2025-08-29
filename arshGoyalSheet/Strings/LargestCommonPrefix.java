package arshGoyalSheet.Strings;
//tryusing trie data structure sometime tomorrow

public class LargestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }


    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        //get the min len of among the strings
        int minLen = Integer.MAX_VALUE;
        for (String string : strs) {
            minLen=Math.min(string.length(), minLen);
        }
        //to store preifxes
        StringBuilder sb = new StringBuilder();
        //travese upt ming len byc checing corresponding chars are matcing or not 
        for (int i = 0; i < minLen; i++) {
            char ch  = strs[0].charAt(i);
            boolean isMatched = true;
            for (int j = 1; j < len; j++) {
                if (strs[j].charAt(i) != ch) {
                    //not prefix
                    isMatched=false;
                    break;
                }
            }
            if (isMatched) {
                sb.append(ch);
            }else{
                break;
            }
        }
        return sb.toString();

    }
}
