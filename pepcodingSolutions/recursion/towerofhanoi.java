package pepcodingSolutions.recursion;

public class towerofhanoi {
    public static void main(String[] args) {
        int n = 3;
        toh(n, 'A', 'B', 'C');
    }

    static void toh(int n,char t1, char t2, char t3){
        //base case
        if(n==0) return;

        //faith 
        toh(n-1,t1,t3,t2);
        System.out.println("Move disk " + n + " from " + t1 + " to " + t2);
        toh(n-1,t3,t2,t1);
    }
}
