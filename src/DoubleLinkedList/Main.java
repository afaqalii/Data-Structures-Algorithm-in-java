package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.showList();
        list.insertNodeAt(5,10);
        list.insertNodeAt(3,20);
        list.showList();
        list.deleteAtStart();
        list.showList();
        list.deleteAtEnd();
        list.showList();
        list.deleteNodeAt(3);
        list.showList();
    }
}
