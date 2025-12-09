package NQT.Maths;


public class SumOfFibonacci {


    // thasts o(n) time and o(1) space 
    // static long sum = 0;
    public static void main(String[] args) {
        long n = 5;
        System.out.println(fibSum(n));
    }

 static long fibSum(long N) {
        // code here
        // need to built o(log n) solution
        
        
    }


    static void fiboHelper(long n, long[] sum ){
        long mod = 1000000007;

        if(n == 0){
            return ;
        }

        if (n == 1) {
            sum[0] += 1;
            return ;
        }
        long a = 0;
        long b = 1;
        long c = 0;
        for (int i = 2; i <= n; i++) {
            c = (a + b) % mod;
            a = b;
            b = c;
        }
        sum[0] += c;
        fiboHelper(n - 1, sum) ;
    }
}
