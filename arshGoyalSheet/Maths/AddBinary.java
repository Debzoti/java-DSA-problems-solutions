package arshGoyalSheet.Maths;

public class AddBinary {
    public static void main(String[] args) {
        String ans = binaryAdd("11","1");
        System.out.println(ans);
    }

    static String binaryAdd(String no1, String no2){
        int i = no1.length()-1, j = no2.length()-1;
        int carry =0;
        StringBuilder sb = new StringBuilder();
        int bit1 =0, bit2 =0;

        while(i>=0 || j>=0 || carry==1){
            bit1=(i>=0)?no1.charAt(i) - '0' : 0;
            bit2=(j>=0)?no2.charAt(j) - '0' : 0;
            int sum = bit1 + bit2 + carry;
            carry=sum/2;
            sb.append(sum%2);
            i--;
            j--;
        }
        return sb.reverse().toString();

    }
}
