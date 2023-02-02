package Datenstrukturen.Stack;

import Datenstrukturen.HTLStack;
import Datenstrukturen.Node;

public class Stack implements HTLStack {

    int length = 0;
    Node top = null;

    @Override
    public void push(int value) {
        Node temp = new Node(value);
        temp.setNext(top);
        top = temp;
        length++;
    }

    @Override
    public int pop() {
        if (top == null) {
            System.out.println("+++++++++++++++++");
            System.out.println("No Value");
            System.out.println("+++++++++++++++++");
            return -1;
        }
        Node node = top;
        top = top.getNext();
        length--;
        return node.getValue();
    }

    @Override
    public int peak() {
        if (top == null) {
            System.out.println("----------------------");
            System.out.println("No Value");
            System.out.println("----------------------");
            return -1;
        }
        return top.getValue();
    }
}