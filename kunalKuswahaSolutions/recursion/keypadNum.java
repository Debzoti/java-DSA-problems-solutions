package kunalKuswahaSolutions.recursion;

import java.util.ArrayList;

public class keypadNum {
    public static  void main(String[] args) {
        
       
        System.out.println(keypad("","23"));
        //keypad("","12");
    }

    // this code doesnot handle 7 and 9 as 4 letters issue
    static ArrayList<String> keypad(String p, String up){ // (''. '12')
        //base case
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p); // add the string to the list
            return list; // return the list
        }
        

        ArrayList<String> list = new ArrayList<>();

        int digit = up.charAt(0) - '0' ; // '1' -> 1
        for(int i = (digit-2)*3; i < (digit-1)*3; i++ ){
            // need to convert those digit to chars 
            char ch = (char)('a' + i); // 'a' + 1 = b 
            //faith
            list.addAll(keypad(p + ch, up.substring(1))); // p = p + ch , up = up.substring(1)
        }
        return list; // return the list
    }
}
