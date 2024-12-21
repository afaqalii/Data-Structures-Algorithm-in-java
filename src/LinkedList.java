public class LinkedList {
    Node head;
    int value;

    public LinkedList(){
        head=null;
        value=0;
    }
    // insert node at the start
    public Node insertAtStart(int value){
        Node newNode = new Node(value); // make new node by calling Node class with a value of 'value' and null pointer
        newNode.next = head; // set the new node pointer to the head
        head = newNode; // set the head of the list equal to new node
        return head;
    }

    // insert at end of the list
    public Node insertAtEnd(int value) {
        Node newNode = new Node(value); // create new node instance
        if(head == null) { // if head is null it means it is first node
            head = newNode;
            return head;
        } else { // else traverse the link go to the last node and insert the newNode to the last node 'next'
            Node currentNode = head;
            while (currentNode.next != null) { // traverse until last node is reached
                currentNode = currentNode.next;
            }
            // insert the node at the last node
            currentNode.next = newNode;
            return newNode;
        }
    }
    // insert at specified position
    public Node insertNodeAt(int position,int value) {
       if(position < 1) {
           System.out.println("Invalid position");
           return head;
       }
        Node newNode = new Node(value); // creating new node with the given value
        if(head == null) { // if head is null it means that no node is present therefore
           return head = newNode; // set the head to new node;
        }

        int count = 1; // counter to know the position of node
        Node currentNode = head;
        Node oldNode; // old not to set the newNode.next to replaced node
        while(position - 1 != count){ // traverse the list until we reach the node before at the specified position
            currentNode = currentNode.next;
            count++;
        }
        oldNode = currentNode.next; // storing node that is going to be replaced by new node
        currentNode.next = newNode; // setting new node to the node at specified position
        newNode.next = oldNode; // linking back the newNode the replaced node
        return newNode;
    }
    public void showList() {
        Node T = head;
        if (T == null) {
            System.out.println("The List is empty!!");
        } else {
            System.out.println("\n==================================");
            while (T.next != null) {
                System.out.print("|" + T.data + "|->");
                T = T.next;
            }
            System.out.print("|" + T.data + "|->NULL");
            System.out.println("\n===================================");
        }
    }

}