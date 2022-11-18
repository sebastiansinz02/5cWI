package list.Linkedlist;
import list.HTLList;
import list.Node;

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
        int counter = 0;
        while (actual.getNext() != null) {
            if (counter == index) {
                return actual.getValue();
            } else {
                counter++;
                actual = actual.getNext();
            }

        }
        return -1;
    }

    @Override
    public void remove(int index) {
        Node actual = root;
        int counter = 0;
        while (actual.getNext() != null) {
            if (index == 0){
                root  = root.getNext();
                return;
            }
            else if(counter == index){
                while (actual.getNext() != null) {
                    actual.setValue(actual.getNext().getValue());
                    actual = actual.getNext();
                }
            } else {
                counter++;
                actual = actual.getNext();
            }
        }
    }
}
