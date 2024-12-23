package CircularLinkedList.SingleCircularLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleCircularLinkedList list = new SingleCircularLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.showList();
        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteNodeAt(3);
        list.showList();
    }
}
