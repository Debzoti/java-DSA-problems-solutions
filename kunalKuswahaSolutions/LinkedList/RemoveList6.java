package LinkedList;

public class RemoveList6 {
    public static void main(String[] args) {
        
    }

    public ListNode removeElements(ListNode head, int val) {

     

        //check first node/nodes if its == val skip it
        while (head!= null && head.val == val) {
            head = head.next;
        }

        if (head==null) {
            return head;
        }

        //no for middle nodse
        ListNode curr =head.next;
        ListNode prev = head;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            }else{
                prev = curr;
            }

            curr = curr.next;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
