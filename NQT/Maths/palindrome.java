package NQT.Maths;

public class palindrome{
    public static void main(String[] args) {
        int n = 102;
        palin(n);
    }

    static void palin(int n ){
        int rev = 0;
        int temp = n;
        while (n > 0) {
            int digit = n%10;
            rev = rev * 10 + digit;
            n = n/10;
        }

        if (rev == temp) {
            System.out.println("palindrome");
        } else {
            System.out.println("not p");
        }
    }
}