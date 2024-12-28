package SingleLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third; // No cycle, terminate the list

        list.nature(head);

        /*int choice;
        Scanner input = new Scanner(System.in);

        LinkedList myList = new LinkedList();

        LinkedList h1 = new LinkedList();
        LinkedList h2 = new LinkedList();
*/
        /*while (true) {
            System.out.println("\n########## QUEUE OPERATION'S MENU ##########");
            System.out.println("\t1. INSERT AT START");
            System.out.println("\t2. INSERT AT END");
            System.out.println("\t3. INSERT (CRITERIA)");
            System.out.println("\t4. DELETE FROM START");
            System.out.println("\t5. DELETE FROM END");
            System.out.println("\t6. DELETE (CRITERIA)");
            System.out.println("\t7. MERGING TWO LISTS");
            System.out.println("\t8. SHOW LINKED LIST");
            System.out.println("\t0. Exit Program");
            System.out.println("------------------------------------");
            System.out.print("Enter Your Choice (0/1/2/3/4/5/6/7/8): ");

            choice = input.nextInt();
            int E;

            if (choice == 1) {
                System.out.println("\n------------------------------------");
                System.out.print("\nEnter Element to Insert: ");
                E = input.nextInt();
                myList.insertAtStart(E);

            } else if (choice == 2) {
                System.out.println("\n------------------------------------");
                System.out.print("\nEnter Element to Insert: ");
                E = input.nextInt();
                myList.insertAtEnd(E);

            } else if (choice == 3) {
                System.out.println("\n------------------------------------");
                System.out.print("\nEnter Element to Insert: ");
                E = input.nextInt();
                System.out.print("\nEnter Location of Insertion: ");
                int Loc = input.nextInt();
                myList.insertNodeAt(Loc, E);

            } else if (choice == 4) {
                int Ed = myList.deleteAtStart();

            } else if (choice == 5) {
                int Ed = myList.deleteAtStart();

            } else if (choice == 6) {
                int Ed = myList.deleteAtStart();

            } else if (choice == 7) {
                h1.PopulateList(15);
                h2.PopulateList(10);
                System.out.println("List 1 Nodes: ");
                h1.showList();
                System.out.println("List 2 Nodes: ");
                h2.showList();
                h1.MergeLists(h2);
                System.out.println("-------------------------------------------");
                System.out.println("\nTHE TWO LISTS ARE MERGED SUCCESSFULLY!");
                System.out.println("List-1: ");
                h1.showList();
                System.out.println("List-2: ");
                h2.showList();
                System.out.println("-------------------------------------------");

            } else if (choice == 8) {
                myList.showList();

            } else if (choice == 0) {
                System.out.println("\n--------------------------------");
                System.out.println("Program Exiting.......! \nThank You for Being Here");
                System.out.println("\n--------------------------------");
                System.exit(0);
            }
        }*/
    }
}