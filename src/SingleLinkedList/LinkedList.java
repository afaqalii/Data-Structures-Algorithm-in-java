package SingleLinkedList;

import java.util.ArrayList;
import java.util.Random;

public class LinkedList {
    Node head;
    int value;

    public LinkedList(){
        head=null;
        value=0;
    }
    // insert node at the start
    public Node insertAtStart(int value){
        Node newNode = new Node(value); // make new node by calling SingleLinkedList.Node class with a value of 'value' and null pointer
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
    public Node insertNodeAt(int position, int value) {
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
        while(position - 1 != count && currentNode.next != null){ // traverse the list until we reach the node before at the specified position
            currentNode = currentNode.next;
            count++;
        }
        oldNode = currentNode.next; // storing node that is going to be replaced by new node
        currentNode.next = newNode; // setting new node to the node at specified position
        newNode.next = oldNode; // linking back the newNode the replaced node
        return newNode;
    }

    public int deleteAtStart() {
        Node nextNode; // to store node after the head
        nextNode = head.next;
        head.next = null;
        head = nextNode;
        return head.data;
    }

    public Node deleteAtEnd() {
        Node currentNode = head; // current node is head node
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            if(currentNode.next.next == null) // if the next SingleLinkedList.Node is last node stop the loop
                break;
            else // otherwise go to the next node
                continue;
        }
        currentNode.next = null;
        return currentNode;
    }

    public Node deleteNodeAt(int position) {
        int count = 1;
        Node currentNode = head;
        if(position < 1) {
            System.out.println("Invalid position");
            return head;
        }
        if(position == 1) { // special case: if th  e position is 1 => simply call deleteAtStart
            deleteAtStart();
        }
        while (position - 1 != count && currentNode.next != null){
            currentNode = currentNode.next;
            count++;
        }
        Node nodeToBeDeleted = currentNode.next;
        currentNode.next = null; // optional make the node null so its treated as garbage value (optimization)
        currentNode.next = nodeToBeDeleted.next; // link the currentNode.next to the SingleLinkedList.Node linked with deleted one to prevent link from breaking

        return currentNode;
    }

    public void MergeLists(LinkedList other) {
        Node tempFirstCurrNode, // to store next node of currNode of first List
             tempSecondCurrNode; // to store next node of currNode of second List

        Node firstCurrNode = head; // to store currNode of first List
        Node secondCurrNode = other.head; // to store currNode of second List

        while (firstCurrNode.next != null && secondCurrNode.next != null){
            if(secondCurrNode.next != null) { // only perform when secondNode.next is not null
                tempFirstCurrNode = firstCurrNode.next; // assigned it to its next node;
                firstCurrNode.next = secondCurrNode; // assigned firstNode.next to second List node
                firstCurrNode = tempFirstCurrNode; // assigned the currNode to its next node OR increment to its next Node
            }
            if(firstCurrNode.next != null) {
                tempSecondCurrNode = secondCurrNode.next;
                secondCurrNode.next = firstCurrNode;
                secondCurrNode = tempSecondCurrNode;
            }
        }
        other.head = null;
    }

    public void nature(Node pointer) {
        ArrayList<Node> newList = new ArrayList<>();
        Node curr = pointer; // current node of list
        boolean isFound = false;
        int cycleStartPoint = 1; //point where the cycle start
        int nodesAdded = 0; // no. of nodes added to new linked list
        int nodesOutsideCycle = 0;
        // iterate over the linked list until point cycle is found
        while (!isFound && curr.next != null) {
                if(curr == curr.next){
                    isFound = true;
                    System.out.println("List is snail");
                    System.out.println("Start of node cycle: " + 1);
                    System.out.println("No. of nodes outside cycle: " + 0);
                    System.out.println("No. of nodes in cycle: " + 1); // Concatenate after calculation
                }
                if(nodesAdded == 0) { // if new linked is empty just add first node
                    newList.add(curr);
                    nodesAdded++;
                    curr = curr.next;
                } else {
                    Node tempNode = newList.getFirst();
                    for (int i = 1; i <= nodesAdded; i++) {
                        if(tempNode == curr.next){
                            isFound = true;
                            cycleStartPoint = i;
                            nodesOutsideCycle = cycleStartPoint - 1;
                            System.out.println("List is snail");
                            System.out.println("Start of node cycle: " + cycleStartPoint);
                            System.out.println("No. of nodes outside cycle: " + nodesOutsideCycle);
                            int nodesInCycle = (nodesAdded + 1) - nodesOutsideCycle; // Perform arithmetic first
                            System.out.println("No. of nodes in cycle: " + nodesInCycle); // Concatenate after calculation
                            return;
                        } else {
                            tempNode = tempNode.next;
                        }
                    }
                    nodesAdded++;
                    newList.add(curr);
                    curr = curr.next;
                }
            }
        System.out.println("List is snake");
    }
    private boolean isEven(int num) {
        return num % 2 == 0;
    }
    // method to arrange even nodes at beginning of list
    public void arrangeEvenNodes() {
        Node currNode  = head;
        while (currNode.next != null) {
            if(isEven(currNode.next.data)) {
                Node evenNode = currNode.next;
                currNode.next = currNode.next.next;
                evenNode.next = head;
                head = evenNode;
            } else
                currNode = currNode.next;
        }
    }
    public void PopulateList(int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int d = random.nextInt(100); // Generate random numbers between 0 and 99
            insertAtEnd(d);
        }
        System.out.println(n + " Nodes added with random data.");
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