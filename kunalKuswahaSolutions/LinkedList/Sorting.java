package LinkedList;

public class Sorting {
    public static void main(String[] args) {
        //soert a linked list
        SLL list = new SLL();
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        
        System.out.println(" unsorted Linked List:");
        list.display();
        
        
    }
}
