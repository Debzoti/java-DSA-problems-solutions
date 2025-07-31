package LinkedList;

public class LinkedListCycleII {
    public static void main(String[] args) {
        
    }
    
    
    public static ListNode getCycleNode(ListNode head){
        // ListNode first = head;
        // ListNode second = head;
        // int len = getLength(head);
        // //chxcek if ccyle exists
        // if (isCycle(head)) {
            
        //     //sihft it len times forward
        //     while (len > 0) {
        //         second=second.next;
        //         len--;
        //     }
        //     //incrment and get theanswer
        //     while(first!=second){
        //         first = first.next;
        //         second=second.next;
        //     }
        // }
        // return first;


        ListNode fast = head;
        ListNode slow = head;
        //check if cycle exists
        while(fast!= null && fast.next !=null){
            fast = fast.next.next;
            slow= slow.next;
            if (fast == slow) { //if existz calculate length
                int len =1;
                ListNode temp = slow.next;
                while(temp!=slow){
                    temp = temp.next;
                    len++;
                }

                ListNode first = head;
                ListNode second = head;

                //move second len node forawrdf
                while (len>0) {
                    second = second.next;
                    len--;
                }

                while(second!=first){
                    first = first.next;
                    second = second.next;
                }
                return first;
            }
        }
        return null;
    }
    //get length of the cycle
    public static int getLength(ListNode head){
        int count = 0;
        ListNode fast = head;
        ListNode slow =head;

        while(fast!= null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
           if(slow == fast){// means cycle exists
              ListNode temp = slow.next;
              do {
                temp = temp.next;
                count++;
              } while (temp != fast);
              break;
           }  
        }
        return count;
   }
    public static boolean isCycle(ListNode head){
        ListNode fast = head;
        ListNode slow =head;

        while(fast!= null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
           if(slow == fast){
               return true;
           }
        }
        return false;
    }
    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
