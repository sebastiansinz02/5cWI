package list.Queue;

public class QMain {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }
}

