package StacknQueue;

import java.util.*;

public class GenerateBinaryNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<String> q = new LinkedList<>();

        q.offer("1");

        for (int i = 1; i <= n; i++) {

            String s = q.poll();

            System.out.print(s + " ");

            q.offer(s + "0");
            q.offer(s + "1");
        }
    }
}