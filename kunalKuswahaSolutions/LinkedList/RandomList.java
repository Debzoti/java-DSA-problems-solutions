package LinkedList;

import java.util.HashMap;

public class RandomList {
    public Node copyRandomList(Node head) {
        if (head==null || head.next==null) {
            return head;
        }

        HashMap<Node, Node> map = new HashMap<>();
        //create the copied node --> new node an d set the value
        Node curr = head;
        while(curr != null ){
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        //set the next pointer and random pointer to coipied nodes you ceated in hashmap
        curr = head; //reassigned
        while (curr!=null) {
            Node newNode = map.get(curr);
            newNode.next = map.get(curr.next);
            newNode.random = map.get(curr.random);
            curr=curr.next;
        }

        return map.get(head);
    }


    class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
