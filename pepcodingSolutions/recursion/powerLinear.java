
package pepcodingSolutions.recursion;

public class powerLinear {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }

    static int power(int x, int n) {

        //base case
        if(n==0) return 1;

        //faith
        int xpnm1 = power(x,n-1);
        //calculate xpn using xpnm1
        int xpn = x*xpnm1;

        //calc xpn
        return xpn;

        

    }
}
