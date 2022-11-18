package list.Stack;

public class SMain {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s.pop());
        System.out.println(s.peak());
    }
}