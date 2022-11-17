package list.linkedlist;

import list.HTLList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(4);
        ll.add(5);
        ll.add(6);

        System.out.println(ll.get(3));
        ll.remove(2);
        System.out.println(ll.get(1));




    }
}
