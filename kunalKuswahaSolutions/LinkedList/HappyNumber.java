package LinkedList;

public class HappyNumber {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        
        System.out.println("Linked List:");
        list.display();
        
        int number = 12; // Example number to check if it's a happy number
        boolean isHappy = isHappyNumber(number);
        System.out.println(number + " is a happy number: " + isHappy);
    }

    static boolean isHappyNumber(int number){ //xnumber = 12
        
        int fast = number;
        int slow = number;
        do {
            slow = findSq(slow);
            fast = findSq(findSq(fast));
        } while (fast != slow);

        return slow == 1;
    }

    static int findSq(int n){
        int ans =0;
        while (n!=0) {
            int rem = n % 10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;
    }
}
