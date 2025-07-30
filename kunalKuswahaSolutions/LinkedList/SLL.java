package LinkedList;

public class SLL {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    //props
    public Node head;
    public Node tail;
    public int size;

    //insert at head
    public void insertFirst(int val){
        Node node = new Node(val); 
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;

        }
        // If the list was empty, tail should also point to the new node
        // This ensures that tail is always the last node in the list
        if (tail == null) {
            tail = node;
        }
        // Increment the size of the list
        if (head == null) {     
            size++;
        }
        
        size++;
    }

    //insert and end
    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //insert at index
    public void insert(int val, int index) {
        //get value of that undex using index

        Node temp = head;
        for (int i = 0; i < index-1; i++) { //temp.next go already one step further
            temp = temp.next;
            if (temp == null) {
                System.out.println("Index out of bounds");
                return;
            }
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
        }

        //get node  using index
    public Node getNode(int index) {
        Node temp = head;
        for(int i = 0; i < index; i++) {
           temp = temp.next;
            if(temp == null) {
                return null; // Index out of bounds
            }
        }
        System.out.println(temp.data);
        return temp;
        
    }

    //deletion operatoins 

    //deletfirst
    public void deletfirst(){
        head = head.next;
        if (head == null) {
            tail = null; // If the list becomes empty, update tail
        }
        size--;
    }

    //deletlast
    public void deletlast() {
        //get the second last node
        Node secondLast =  getNode(size - 2);
        if(secondLast == null) {
            // If there is no second last node, it means the list has only one node
            head = null;
            tail = null;
            size = 0;
            return;
        }
        secondLast.next = null; // Set the next of second last node to null
        tail = secondLast; // Update tail to the second last node
        size--;
    }

    //insert using rescusrion
    public void insertRec(int index, int val){
        head = find(val, index, head);
        if (tail == null) {
            tail = head; // If the list was empty, tail should also point to the new node
        }
        size++;
        if (head == null) {
            size++;
        }
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

    }

    private Node find(int val, int index, Node curr){
        //base
        if(index == 0){
            Node temp = new Node(val);
            temp.next=curr;
            return temp;
        }

        Node node = find(val, index--, curr.next);
        return node;
    }

    //delet at index
    public void delete(int index){
        if(index == 0) {
            deletfirst();
            return;
        }
        if(index == size - 1) {
            deletlast();
            return;
        }
        Node prev = getNode(index - 1);

        if(prev == null || prev.next == null) {
            System.out.println("Index out of bounds");
            return;
        }
        prev.next = prev.next.next;
        size--;
    }

    


    //reverse linked list recursively


    //reverse linked list 





    //display
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;   
        }
        System.out.println("null");
    }
}
