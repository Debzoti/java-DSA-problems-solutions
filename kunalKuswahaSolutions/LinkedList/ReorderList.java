package LinkedList;

public class ReorderList {
    public void reorderList(ListNode head) {
        if (head!= null && head.next!= null) {
            return ;
        }

        //find mid to reverse 
        ListNode mid  = middleNode(head);
        
        //poiters to swap refernces 
        ListNode f = head;
        ListNode s = reverseList(mid);

        while (f!= null && s!= null) {
            //swap and forward first pointer
            ListNode Tempf = f.next;
            f.next = s;
            f = Tempf;

             //swap and forward first pointer
             //swap and forward first pointer
            ListNode Temps = s.next;
            s.next = f;
            s = Temps;

        }

        //set null to tail to mainitn the list
        if (f!=null) {
            f.next = null;
        }
    }


    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode nextNode = curr.next;

            curr.next = prev;
            prev = curr;

            curr = nextNode;
        }
        return prev;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
