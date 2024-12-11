public class LinearQueue {
    private final int size;
    private int rear, front;
    private final int[] arr;

    // Constructor to initialize the queue
    public LinearQueue(int size) {
        this.size = size;
        this.rear = -1;
        this.front = -1;
        this.arr = new int[size];
    }

    // Method to insert an element into the queue
    public void insert(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = element;
    }

    // Method to delete an element from the queue
    public int delete() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -999;
        }
        int removedElement = arr[++front];
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        return removedElement;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Method to display the elements of the queue
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("[");
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(arr[i]);
            if (i < rear) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
