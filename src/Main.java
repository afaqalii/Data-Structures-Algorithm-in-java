public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.showList();
        list.deleteAtStart();
        list.deleteAtEnd();
        list.showList();
        list.deleteNodeAt(2);
        list.showList();
    }
}