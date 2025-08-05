package LinkedList;

import java.util.List;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if( head==null || head.next==null || k<=0){
            return head;
        }

        ListNode prevLastNode =head;
        while (prevLastNode.next!=null) {
            prevLastNode = prevLastNode.next;
            
        }

        //connnect last node to head
        prevLastNode.next = head;

        //find the new end
        int len = 1;
        ListNode newEnd = head;
        int rotations = k % len; // Effective rotations
        int stepsToNewEnd = len - rotations;
        for (int i = 0; i < stepsToNewEnd; i++) {
            newEnd = newEnd.next;
        }
        
        //set the new head
        head = newEnd.next;
        newEnd.next = null;
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
