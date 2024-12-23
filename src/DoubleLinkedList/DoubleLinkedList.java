package DoubleLinkedList;

public class DoubleLinkedList {
    Node head;
    int value;

    // constructor
    public DoubleLinkedList() {
        this.head = null;
        this.value = 0;

    }

    // METHODS
    public Node insertAtStart(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            return head;
        }
        Node currNode = head;

        newNode.next = currNode;
        currNode.prev = newNode;
        head = newNode;

        return newNode;
    }

    // insert at end
    public Node insertAtEnd(int value) {
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            return newNode;
        }
        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
        return newNode;
    }

    //insert at specific position
    public Node insertNodeAt(int position,int value){
        if(position < 1){
            System.out.println("Invalid position");
            return head;
        }
        Node currNode = head;
        Node newNode = new Node(value);
        if(position == 1) {
            if(head == null)
                return head = newNode;
            else {
                newNode.next = currNode;
                currNode.prev = newNode;
                return head = newNode;
            }
        }
        int count = 1;
        while (position != count && currNode.next != null) {
            currNode = currNode.next;
            count++;
        }
        Node prevNode = currNode.prev;
        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = currNode;
        currNode.prev = newNode;
        return newNode;
    }

    public Node deleteAtStart() {
        Node nextNode = head.next;
        nextNode.prev = null;
        return head = nextNode;
    }
    public Node deleteAtEnd() {
        Node currNode = head;
        Node prevNode = null;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        prevNode = currNode.prev;
        prevNode.next = null;
        return currNode;
    }

    public Node deleteNodeAt(int position) {
       if(position < 1)
           System.out.println("Invalid position");
       Node currNode = head;
       int count = 1;
       while(count != position && currNode.next != null) {
           currNode = currNode.next;
           count++;
       }
       Node nextNode = currNode.next; // the node before current node
       Node prevNode = currNode.prev; // the node after current node
       if(currNode.prev == null) { // when currNode.prev is empty is means it is first node
           nextNode.prev = null;
           return head = nextNode; // make the head the second node because first node is deleted
       } else if (currNode.next == null) { // currNode.next is null it means it is last node
           prevNode.next = null;
           return currNode;
       } else {
           prevNode.next = nextNode;
           nextNode.prev = prevNode;
           return currNode;
       }
    }
    public void showList() {
        Node currNode = head;

        if (currNode == null) {
            System.out.println("Doubly Linked List is empty");
        } else {
            System.out.println("\nForward Traversal:");
            System.out.println("==================================");

            // Traverse forward
            Node lastNode = null;
            while (currNode != null) {
                System.out.print("|" + currNode.data + "|<->");
                lastNode = currNode; // Store the last node for reverse traversal
                currNode = currNode.next;
            }
            System.out.print("NULL");
            System.out.println("\n==================================");

            // Traverse backward
          /*  System.out.println("\nReverse Traversal:");
            System.out.println("==================================");
            while (lastNode != null) {
                System.out.print("|" + lastNode.data + "|<->");
                lastNode = lastNode.prev;
            }
            System.out.print("NULL");
            System.out.println("\n==================================");*/
        }
    }


}
