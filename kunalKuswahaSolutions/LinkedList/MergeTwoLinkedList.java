public class MergeTwoLinkedList {
    public static void main(String[] args) {
        SLL list1 = new SLL();
        list1.insertFirst(5);
        list1.insertFirst(3);
        list1.insertFirst(1);

        SLL list2 = new SLL();
        list2.insertFirst(6);
        list2.insertFirst(4);
        list2.insertFirst(2);

        SLL mergedList = mergeTwoLists(list1, list2);
        mergedList.display(); // Expected output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
    }

    public static SLL mergeTwoLists(SLL list1, SLL list2) {
        SLL res = new SLL();
        SLL.Node first = list1.head;
        SLL.Node second = list2.head;

        while(first != null && second != null){
            if (first.data > second.data) {
                res.insertLast(first.data);
                first = first.next;
            }else{
                res.insertLast(second.data);
                second = second.next;
            }
        }

        //adde xtra elemennts on both lists
        while(first != null){
            res.insertLast(first.data);
            first = first.next;
        }

        while (second != null) {
            res.insertLast(second.data);
            second = second.next;
        }
        
        return res;
    }
}
