package list.Linkedlist;

public class LMain {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(4);
        ll.add(5);
        ll.add(6);

        System.out.println(ll.get(4));
        ll.remove(5);
        System.out.println(ll.get(5));




    }
}
