package LinkedList;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode fHead = head;
        ListNode sHead = middleNode(head);

        reverseList(sHead);

        while (fHead != null && sHead != null) {
            if (fHead!=sHead) {
                break;
            }
            fHead = fHead.next;
            sHead = sHead.next;
        }

        if (fHead == null || sHead == null) {
            return true;
        }

        return false ;
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
