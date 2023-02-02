package Datenstrukturen.Queue;

import Datenstrukturen.HTLQueue;
import Datenstrukturen.Node;

public class Queue implements HTLQueue {
    int length = 0;
    Node first, rear = null;

    @Override
    public void enqueue(int value) {
        Node temp = new Node(value);
        if (first == null) {
            first = temp;
        } else {
            rear.setNext(temp);
        }
        rear = temp;
        length++;
    }

    @Override
    public int dequeue() {
        if (first == null) {
            System.out.println("++++++++++++++++");
            System.out.println("No Value");
            System.out.println("++++++++++++++++");
            return -1;
        }
        int result = first.getValue();
        first = first.getNext();
        length--;
        if (first == null) {
            rear = null;
        }
        return result;
    }
}


