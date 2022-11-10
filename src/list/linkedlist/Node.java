package list.linkedlist;

public class Node {
    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public Node setValue(int value) {
        this.value = value;
        return this;
    }

    public Node getNext() {
        return next;
    }

    public Node setNext(Node next) {
        this.next = next;
        return this;
    }
}
