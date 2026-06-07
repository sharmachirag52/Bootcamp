package StacknQueue;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int data) {
        s1.push(data);
    }

    void dequeue() {

        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        System.out.println("Deleted: " + s2.pop());
    }

    void peek() {

        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        System.out.println("Front Element: " + s2.peek());
    }

    public static void main(String[] args) {

        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();

        q.peek();
    }
}