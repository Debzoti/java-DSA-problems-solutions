package arshGoyalSheet.greedy;

public class lemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        System.out.println(LemonadeChange(bills));
    }

    public static boolean LemonadeChange(int[] bills) {
        int f=0 ,t =0;

        for (int i = 0; i < bills.length; i++) {
            
            if (bills[i] == 5) {
                f = f + 1;
                
                }
                if (bills[i] == 10) {
                    if (f >= 1) {
                        f = f-1;
                        t=t+1;
                    }else{
                        return false;
                    }
                }
                
                if (bills[i] == 20) {
                    if (t >= 1 && f >=1) {
                        t = t-1;
                        f = f-1;
                    }else if(f >= 3){
                        f = f-3;
                    }else{
                        return false;
                    }

                }

        }
        return true;
    }
}
