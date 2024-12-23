package CircularLinkedList.SingleCircularLinkedList;

public class SingleCircularLinkedList {
    Node head;
    int value;

    public SingleCircularLinkedList(){
        this.head = null;
        this.value = 0;
    }

    // insert value at the beginning
    public Node insertAtStart(int value) {
        Node newNode = new Node(value);
        if(head == null){ // if linked list is empty point newNode to itself
            newNode.next = newNode;
            return head = newNode;
        } else {
            Node currNode = head;
            Node tempHead = head; // used to find second last node
            while (tempHead != currNode.next)
                currNode = currNode.next;
            currNode.next = newNode;
            newNode.next = tempHead;
          return  head = newNode;
        }
    }

    //insert value at the end
    public Node insertAtEnd(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            newNode.next = newNode;
            return head = newNode;
        }
        Node currNode, tempHead;
        tempHead = currNode = head;
        while(tempHead != currNode.next)
            currNode = currNode.next;

        currNode.next = newNode;
        newNode.next = tempHead;
        return newNode;
    }

    //insert at any point
    public Node insertAtAny(int position, int value) {
        if(position < 1) { // when position is invalid
            System.out.println("Invalid position");
            return head;
        }
        if(position == 1 && head == null) // when linked list is empty and position is 1
            insertAtStart(value); // we will simply insert at start

        Node newNode = new Node(value);
        Node currNode, tempHead;
        tempHead = currNode = head;
        if(position == 1) { // when position is 1 and we have one element
            while (tempHead != currNode.next)
                currNode = currNode.next;
            newNode.next = tempHead;
            currNode.next = newNode;
            return head = newNode;
        }
        int count = 1;
        while (position - 1 != count) {
            currNode = currNode.next;
            count++;
        }
        Node nextNode = currNode.next;
        currNode.next = newNode;
        newNode.next = nextNode;
        return newNode;
    }

    // delete at firt node
    public Node deleteAtBeginning(){
        if(head == null) {
            System.out.println("List is empty");
            return null;
        }
        if(length() == 1) {
            head = null;
            return head;
        }
        Node tempHead,currNode,secondNode;
        tempHead = currNode = head;
        secondNode = head.next;
        while (tempHead != currNode.next){
            currNode = currNode.next;
        }
        currNode.next = secondNode;
        head = secondNode;
        return head;
    }
    public Node deleteAtEnd() {
        if(length() == 1)
            return head = null;

        Node temphead, currNode;
        temphead = currNode = head;
        while (temphead != currNode.next) {
            if (currNode.next.next == temphead) { // it means it is second last node
               return currNode.next = head;
            } else
                currNode = currNode.next;
        }
        return null;
    }
    public Node deleteNodeAt(int position) {
        if(head == null) {
            System.out.println("List is empty");
            return null;
        }
        if(position ==  1 && length() == 1) {
            return head = null;
        } else if (position == 1) {
            return head = head.next;
        } else {
            int count = 1;
            Node currNode,nextNode;
            currNode  = head;
            while (position - 1 != count) {
                currNode = currNode.next;
                count++;
            }
            nextNode = currNode.next.next;
            currNode.next = nextNode;
            return nextNode;
        }
    }
    public int length() {
        if(head == null){
            return 0;
        } else {
            int count = 1;
            Node tempHead, currNode;
            tempHead = currNode = head;
            while (tempHead != currNode.next){
                currNode = currNode.next;
                count++;
            }
            return count;
        }
    }
    // show nodes
    public void showList(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node tempHead, currNode;
        tempHead = currNode = head;
        System.out.println("\n ==========================");
        while (tempHead != currNode.next){
            System.out.print("| "+ currNode.data + " | ->");
            currNode = currNode.next;
        }
        System.out.print("| "+ currNode.data + " | ->");
        if(tempHead == currNode.next)
            System.out.println("\n ==========================");
    }
}

