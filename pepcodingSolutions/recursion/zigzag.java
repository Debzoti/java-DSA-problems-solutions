package pepcodingSolutions.recursion;

public class zigzag{

    public static void main(String[] args) {
        int n = 5;
        pzz(n);
    }

    static void pzz(int n){
        //base case
        if(n==0) return;
        System.out.println("pre" + n);
        pzz(n-1);
        System.out.println("in" + n);
        pzz(n-1);
        System.out.println("post" + n);
    }
}