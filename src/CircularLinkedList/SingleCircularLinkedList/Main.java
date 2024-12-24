package CircularLinkedList.SingleCircularLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleCircularLinkedList list = new SingleCircularLinkedList();
        list.insertAtStart(1);
        list.insertAtStart(2);
        list.insertAtStart(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertNodeAt(3,1000);
        list.insertNodeAt(4,2000);
        list.insertNodeAt(5,3000);
        list.showList();
    }
}
