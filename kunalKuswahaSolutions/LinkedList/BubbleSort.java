package LinkedList;

public class BubbleSort {

    public static void main(String[] args) {
         // Create the linked list: 4 -> 2 -> 5 -> 1 -> 3
        //  BubbleSort bs = new BubbleSort();
         ListNode head = new ListNode(4);         head.next = new ListNode(2);
         head.next.next = new ListNode(5);
         head.next.next.next = new ListNode(1);
         head.next.next.next.next = new ListNode(3);
 
         System.out.println("Before sorting:");
         printList(head);
 
         int length = getLength(head);
         head = sort(length - 1, 0, head);
 
         System.out.println("After sorting:");
         printList(head);
    }


    public static ListNode sort(int row, int col, ListNode head){
        if (head == null || head.next == null || row == 0) return head;

        if (col<row) { //treat only two nodes
            if (head.val >head.next.val) {
                int temp = head.val;
                head.val = head.next.val;
                head.next.val =temp;
            }
             sort(row,col+1,head.next);
        }else{
            sort(row-1, 0, head);
        }

        return head;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    

    //display
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    //length
    public static int getLength(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
