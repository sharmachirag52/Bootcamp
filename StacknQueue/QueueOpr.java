package StacknQueue;

import java.util.*;

public class QueueOpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        while (true) {
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (q.size() < 5) {
                        int a = sc.nextInt();
                        q.offer(a);
                        System.out.println("Enqueue: " + a);
                    } else {
                        System.out.println("Queue is Full");
                    }
                    break;

                case 2:
                    if (q.size() > 0) {
                        System.out.println("Dequeue: " + q.peek());
                        q.poll();
                    } else {
                        System.out.println("Queue is Empty");
                    }
                    break;

                case 3:
                    if (q.size() > 0) {
                        for (int x : q) {
                            System.out.print(x + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Queue is Empty");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default : 
                    System.out.println("Invalid Input.");
                    break;
            }
        }
    }
}
