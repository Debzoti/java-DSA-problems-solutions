package arshGoyalSheet.LinkedList;


public class AddTwoNumbers {

    public ListNode AddTwoNumbers(ListNode l1, ListNode l2){
        ListNode first = l1, second = l2;
        ListNode dummy = new ListNode(-1);
        ListNode resList = dummy;
        int carry = 0;
        
        //if both lists are empty
        if (first == null && second == null) {
            return null;
        }
        //traverse list heads to the last
        while (first != null || second != null) {
                int val1 = (first!=null) ? first.val: 0;
                int val2 = (second.val!=null) ? second.val: 0;

                //if both lists are empty
                if (val1 == 0 && val2 == 0 && carry == 0) {
                    break;
                }
                int sum = val1 + val2 + carry;

                carry = sum / 10;
                sum = sum % 10;

                ListNode newNode = new ListNode(sum);
                resList.next = newNode;
                resList = resList.next;

                if (first != null) {
                    first = first.next;
                }
                if (second != null) {
                    second = second.next;
                }
            }
            return dummy.next;
        }
    
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

