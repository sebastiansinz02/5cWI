package list.linkedlist;

import list.HTLList;

public class LinkedList implements HTLList {
    private Node root;

    @Override
    public void add(int value) {
        Node n = new Node(4);
        if (root == null) {
            root = n;
        } else {
            Node actual = root;
            while (actual.getNext() != null) {
                actual = actual.getNext();
            }
            actual.setNext(n);
        }

    }

    @Override
    public int get(int index) {
        Node actual = root;
        for (int i = 0; i < index - 1; i++) {
            actual = actual.getNext();
        }
        return actual.getValue();
    }

    @Override
    public void remove(int index) {
        Node actual = root;
        for (int i = 0; i<index - 1; i++){
            actual = actual.getNext();
        }
        actual.setNext(null);
    }
}
