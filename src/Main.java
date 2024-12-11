public class Main {
    public static void main(String[] args) {
             LinearQueue q = new LinearQueue(3);
                q.insert(1);
                q.insert(2);
                q.insert(3);
                q.show();
                q.delete();
                q.delete();
                q.delete();
                q.delete();
                q.show();
                q.insert(1);
                q.insert(2);
                q.insert(3);
                q.insert(4);
                q.show();

    }
}