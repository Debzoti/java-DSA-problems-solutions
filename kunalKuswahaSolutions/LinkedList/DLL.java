package LinkedList;

public class DLL {
    
    public class Node{
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    //props
    Node head;
    Node tail;
    public int size;

    //INSERTION METHODS

    //insert at head
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        if (head != null) {
            head.prev = node ;
        }else{
            tail = node;
        }
        head = node ;
        size++;
    }

    //insert at end
    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            head = node ;
            tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }


    //insert at index
    public void insert(int val, int index){
        Node node = new Node (val);

        Node temp = head;
        for(int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if(temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if(temp.next != null) {
            temp.next.prev = node;
        } else {
            tail = node; // Update tail if inserting at the end
        }
        size++;
    }



    //DELETION METHODS


    //delete first
    public void deletFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    //delete last
    public void deletLast(){
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        if (tail.prev == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    //delete at index
    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            deletFirst();
            return;
        }
        if (index == size - 1) {
            deletLast();
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        size--;
    }


    
    //DISPLAY
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }



//DISPLAY reverse

    public void displayReverse() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}
