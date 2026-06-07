package StacknQueue;

public class StackUsingLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Deleted: " + top.data);
            top = top.next;
        }
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Top Element: " + top.data);
        }
    }

    void display() {
        if (top == null) {
            System.out.println("Stack Empty");
        } else {
            Node temp = top;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        StackUsingLinkedList s = new StackUsingLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();

        s.peek();
    }
}