package LinkedList;

public class ReverseSubList {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        //check if thers left and rifhr are equal
        if (left == right) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        //move curr to left position
        for (int i = 0; i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }

        //save the connection before reversing
        ListNode lastNode = prev;
        ListNode newSubListEnd = curr;
        
        //reverse the sublist
        ListNode next = null;
        for (int i = 0; i < right - left + 1; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //connect the reversed sublist with the rest of the list
        if (lastNode != null) {
            lastNode.next = prev; // connect the end of the first part to the new head of the reversed sublist
        } else {
            head = prev; // if left is 1, update head to the new head of the reversed sublist
        }
        newSubListEnd.next = curr;
        return head; // return the modified list
    } 
    

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
