package arshGoyalSheet.LinkedList;

import java.util.List;
import java.util.Stack;

public class AddTwoNUmbersII {

static class sumRes{
    ListNode node ;
    int carry;
    sumRes(ListNode node,int carry){
        this.node=node;
        this.carry=carry;
    }
}
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    Stack<ListNode> stack1 = new Stack<>();
    Stack<ListNode> stack2 = new Stack<>();

    //push all nodes to stack
    while (l1 != null) {
        stack1.push(l1);
        l1 = l1.next;
    }
    while (l2 != null) {
        stack2.push(l2);
        l2 = l2.next;
    }

    int carry =0;
    ListNode dummy = new ListNode(-1);
    ListNode resList = dummy;

    //run while both stacks are not empty
    while(!stack1.isEmpty() || !stack2.isEmpty() || carry >0){
        int val1 = stack1.isEmpty() ? 0 : stack1.pop().val;
        int val2 = stack2.isEmpty() ? 0 : stack2.pop().val;

        int sum = val1 + val2 + carry;
        carry = sum / 10;
        sum = sum % 10;

        ListNode newNode = new ListNode(sum);
        newNode.next = resList.next; //link the new node to the front
        resList.next = newNode; //move the dummy's next to the new node
        resList = resList.next;

    }


    return dummy.next;
      
}
    static sumRes recurseAdd(ListNode l1, ListNode l2){
        //bae case
        if(l1==null && l2==null){
            return new sumRes(null,0);
        }

        sumRes next = recurseAdd(l1.next, l2.next); //traverse forward

        //add the sum and create nodes and save carry s joinig nodeas
        int sum = l1.val + l2.val + next.carry;
        ListNode curr = new ListNode(sum%10);
        curr.next = next.node;
        
        return new sumRes(curr,sum/10);
    }

    static void addNodes(ListNode head, int diff){
        for (int i = 0; i < diff; i++) {
            ListNode curr = new ListNode(0);
            curr.next= head;
            head = curr;
        }
    }

    static int getLength(ListNode head){
        int len =0;
        ListNode curr = head;
        while(curr!=null){
            curr = curr.next;
            len++;
        }
        return len;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
