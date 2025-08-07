package LinkedList;

public class ConvertDecimal {
    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return 0; // Return 0 if the list is empty
            
        }
        int res = 0;
        ListNode curr = head;

        // Traverse the linked list
        while (curr != null) {
            // Shift the result to the left (multiply by 2)
            res = res * 2 + curr.val;
            curr = curr.next; // Move to the next node
        }

        // Return the final decimal value
        return res;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
