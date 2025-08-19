package arshGoyalSheet.Rercursion;

public class LuckyNumber {
    public static void main(String[] args) {
        int n = 13;
        Boolean ans = isLucky(n);
        System.out.println(ans);
    }

    public static boolean isLucky(int n) {
        // code here
        int step = 2; //initial step is 2
        int pos = n; // before del n is on nth position

        while (step<=pos) {
            //if itsin range of step 

            if (pos%step == 0) {
                return false;
            }
            // if its not deleted updaet its position
            pos = (pos - pos/step);
            step++;
        }
        return true;
    }

public static int step = 2;
//make it recursive
    public static boolean isLucky(int pos) {
        
        //base case
        if(step>=pos) return true;

        if(pos%step ==0) return false;

        //update pos after deletion
       int newPos = pos - (pos/step);

        step++;
        return isLucky(newPos);
    }

} 

