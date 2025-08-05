package LinkedList;

public class revreseKNodes {

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1){
            return head;
        }
        
        ListNode curr = head;
        ListNode prev = null;
        while (true) {
            ListNode kthNode = getKthNode(curr, k); // Get the kth node from the current position
            if (kthNode == null) {
                break; // If there are fewer than k nodes left, exit the loop
            }

           
            ListNode newEnd = curr; // This will be the new end of the reversed group
            ListNode prevNodeOfSublist = prev; // This will be the previous node of the sublist
            ListNode next = null;
            int index = 0;
            //reverse k nodes
            while (curr != null && index < k) {
                next = curr.next; // Store the next node
                curr.next = prev; // Reverse the current node's pointer
                prev = curr; // Move prev to the current node
                curr = next; // Move to the next node
                index++;
            }

            if (prevNodeOfSublist != null) {
                prevNodeOfSublist.next = prev; // Connect the previous part to the reversed sublist
                
            }else {
                head = prev; // If this is the first group, update the head
            }

            newEnd.next = curr; // Connect the end of the reversed sublist to the next part
            
            if (curr == null) {
                break; // If there are no more nodes to process, exit the loop
            }
            
            prev = newEnd; // Move prev to the end of the reversed sublist for the next iteration
        }

        return head;
    }
    

    public ListNode getKthNode(ListNode head, int k) {
        ListNode curr = head;
        while (curr != null && k > 1) {
            curr = curr.next;
            k--;
        }
        return curr; // Returns the kth node or null if there are fewer than k nodes
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
