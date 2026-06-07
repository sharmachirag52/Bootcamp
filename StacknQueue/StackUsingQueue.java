package StacknQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int data) {

        q2.offer(data);

        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    void pop() {

        if (q1.isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }

        System.out.println("Deleted: " + q1.poll());
    }

    void peek() {

        if (q1.isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }

        System.out.println("Top Element: " + q1.peek());
    }

    void display() {

        for (int x : q1) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        StackUsingQueue s = new StackUsingQueue();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();

        s.peek();
    }
}