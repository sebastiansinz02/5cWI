package list.linkedlist;

import list.HTLList;

public class LinkedList implements HTLList {
    private Node root;

    @Override
    public void add(int value) {
        Node n = new Node(4);
        if (root==null){
            root=n;
        } else {
            Node actual = root;
            while (actual.getNext()!=null){
                actual = actual.getNext();
            }
            actual.setNext(n);
        }

    }

    @Override
    public int get(int index) {
        return -1;

    }

    @Override
    public void remove(int index) {

    }
}
