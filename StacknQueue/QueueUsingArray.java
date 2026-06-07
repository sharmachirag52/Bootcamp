package StacknQueue;

public class QueueUsingArray {

    int[] queue = new int[5];
    int front = -1, rear = -1;

    void enqueue(int data) {

        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1)
            front = 0;

        queue[++rear] = data;
    }

    void dequeue() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted: " + queue[front++]);
    }

    void peek() {

        if (front == -1 || front > rear)
            System.out.println("Queue Empty");
        else
            System.out.println("Front Element: " + queue[front]);
    }

    void display() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueUsingArray q = new QueueUsingArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.peek();
    }
}