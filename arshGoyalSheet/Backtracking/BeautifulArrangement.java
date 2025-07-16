package arshGoyalSheet.Backtracking;

public class BeautifulArrangement {
    static int count =0;
    public static void main(String[] args) {
        int n = 3;
       int count = findArrangements(n);
       System.out.println(count);
    }


    static int findArrangements(int number){
        count =0; //reset before each call
        //construct the array
        int[] nums = new int[number+1];
        for (int i = 1; i <= number; i++) {
            nums[i]=i;
        }
        find(nums,number,1);
        return count;
    }

    static void find(int[] nums, int limit, int val){
        //base case
        if (val > limit) {
            count++;
            return;
        }

        //loop through
        for (int i = val; i <=limit; i++) {
            swap(nums,val,i);
            //check constarints
            if (val%nums[val] == 0 || nums[val]%val == 0) {
                find(nums,limit,val+1);
            }
            //restore nad bcaktrack
            swap(nums,val,i);
        }
    }

    static void swap(int[] nums , int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
