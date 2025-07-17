package LinkedList;

public class Main {
    public static void main(String[] args) {
        SLL list = new SLL();
        // You can add methods to manipulate the linked list here
        // For example, list.add(5), list.remove(3), etc.
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(5);
        list.insertFirst(17);
        list.insertFirst(55);
        list.insertLast(100);
        list.insert(10, 2); 
        // list.getVal(2);// Insert 10 at index 2
        list.deletfirst();
        list.deletlast();
        list.delete(2); // Delete the node at index 2
        list.display(); // Output: 17 -> 5 -> 1 -> 2 -> null
        System.out.println("Size of the list: " + list.size); // Output:

    }
}
