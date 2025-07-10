package arshGoyalSheet.Strings;

public class ReverseWord {
    public static void main(String[] args) {
        String res = reverseWords("   hello world ");
        System.out.println(res);
    }

    static String reverseWords(String s){
        s.trim();
        int ptr1 = s.length() - 1;
        StringBuilder res = new StringBuilder();
        while (ptr1>=0) {
            //move ptr1 to end of each word
            while (ptr1>=0 && s.charAt(ptr1)==' ') {
                ptr1--;
            }
            //break if reaches the beggingig
            if (ptr1<0) {
                break;
            }

            //mark the end
            int ptr2 = ptr1;

            //move to start
            while (ptr1>=0 && s.charAt(ptr1)!=' ') {
                ptr1--;
            }
            //save the word
            String word = s.substring(ptr1+1, ptr2+1);
            res.append(word);
            res.append(" ");
        }

        return res.toString().trim();
    }
}
