package StacknQueue;

import java.util.*;

public class ReverseFirstKElements {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        int k = 3;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }

        while (!st.isEmpty()) {
            q.offer(st.pop());
        }

        int size = q.size();

        for (int i = 0; i < size - k; i++) {
            q.offer(q.poll());
        }

        System.out.println(q);
    }
}