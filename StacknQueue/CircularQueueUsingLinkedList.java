package StacknQueue;

public class CircularQueueUsingLinkedList {

    int[] queue = new int[5];
    int front = -1, rear = -1;

    void enqueue(int data) {

        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % queue.length;
        queue[rear] = data;
    }

    void dequeue() {

        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted: " + queue[front]);

        if (front == rear)
            front = rear = -1;
        else
            front = (front + 1) % queue.length;
    }

    void display() {

        if (front == -1) {
            System.out.println("Queue Empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % queue.length;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueueUsingLinkedList q = new CircularQueueUsingLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();
    }
}