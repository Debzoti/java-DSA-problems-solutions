package LinkedList;

public class MergeSort {

    public static ListNode sort(ListNode head){
        if (head==null || head.next==null) {
            return head;
        }

        ListNode mid = middleNode(head);

        //need to bresk this into 2 lists so bresk the mid 
        ListNode left = head;
        ListNode right  = mid.next;
        mid.next = null;


        left = sort(left);
        right = sort(right);

        
        return mergeTwoLists(left, right);
    }

        //merge lists
        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            MergeSort ms = new MergeSort();
            ListNode dummy = ms.new ListNode();;
            ListNode res =dummy;
    
            while(list1 != null && list2 != null){
                if (list1.val > list2.val) {
                    res.next = list2; 
                    list2 = list2.next;
                }else{
                    res.next = list1; 
                    list1 = list1.next;
                }
                res = res.next;
            }
    
            //adde extra elemennts on both lists
                while(list1 != null){
                res.next = list1; 
                list1 = list1.next;
                res = res.next;
            }

            while (list2 != null) {
                res.next = list2; 
                        list2 = list2.next;
                    res = res.next;
            }
            
            return dummy.next;
        }
        
    //get mid node
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }


    public class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
}

