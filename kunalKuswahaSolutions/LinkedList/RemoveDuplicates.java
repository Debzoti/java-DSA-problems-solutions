package LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(2);
        list.insertLast(5);
       list.insert(2, 1); 

        list.display(); // Expected output: 1 -> 1 -> 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5 -> 5 -> null
        removeDuplicates(list);
        list.display(); // Expected output: 1 -> 2 -> 3 -> 4

    }
    
    public static SLL removeDuplicates(SLL list) {
        if (list.head == null || list.head.next == null) {
            return list; // No duplicates in an empty or single-node list
        }

        SLL.Node current = list.head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                // Skip the next node as it is a duplicate
                current.next = current.next.next;
                list.size--; // Decrease size as we removed a node
            } else {
                current = current.next; // Move to the next node
            }
        }
        return list;
    }
}
