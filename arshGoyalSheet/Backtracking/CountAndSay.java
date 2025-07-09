package arshGoyalSheet.Backtracking;

public class CountAndSay {
    public static void main(String[] args) {
        String currStr = "";
        int n =5;
        handler(1, currStr, n);
        System.out.println(currStr);
    }

    static void handler(int number, String currStr, int limit){
        if(number>limit ){
            return ;
        }

        for(int i = 0; i < currStr.length(); i++){
            char ch = currStr.charAt(i);

            int count = occurence(ch,currStr,i);
            currStr= currStr.substring(0, i) + Integer.toString(count) + currStr.substring(i+1);
        }
        handler(number + 1, currStr, limit);
    }

    static int occurence(char ch, String currString,int index){
        int count = 1;
        for (int i = index; i < currString.length(); i++) {
            if (i>0 && currString.charAt(i)==currString.charAt(i-1)) {
                count+=1;
            }else{
                break;
            }

        }
        return count;
    }
}
