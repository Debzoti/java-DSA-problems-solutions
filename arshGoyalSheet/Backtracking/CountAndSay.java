package arshGoyalSheet.Backtracking;

public class CountAndSay {
    public static void main(String[] args) {
        
        int n =5;
        String ans = handler(n);
        System.out.println(ans);
    }
    static String handler(int input){
        //base
       if(input == 1){
        return "1";
       }
        //stack wise
       String upperCallAns = handler(input-1); //goes upto 1 and startin to return 1
       return buildLowerAns(upperCallAns); //start buulding with prev calls and pass to
    }

    static String buildLowerAns(String s){
        String res = "";
        int i =0;
        
        //loop upto s length to caclulatr th enext ans to pass
        while(i<s.length()){
            int count = 1;
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                count+=1;
                i+=1;
            }
            res += Integer.toString(count) + s.charAt(i);//go to the next character
            i+=1;
        }
        return res;
    }
    
}
