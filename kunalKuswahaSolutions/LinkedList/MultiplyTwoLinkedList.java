package LinkedList;

public class MultiplyTwoLinkedList {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long n1 = 0, n2=0;
        int MOD = 1000000007;
        //buidl the first number
        while (first!= null) {
            n1 =(( n1 * 10) + first.data) % MOD;
            first = first.next;
        }


        //build the second num
        while (second!= null) {
            n2 =(( n2 * 10) + second.data) % MOD;
            second = second.next;
        }


        return (n1 * n2) % MOD;
    }

    class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}
