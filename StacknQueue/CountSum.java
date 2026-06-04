package StacknQueue;

import java.util.*;

public class CountSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            q.offer(a);
        }

        int sum = 0;

        while (!q.isEmpty()) {
            sum += q.poll();
        }

        System.out.println(sum);
    }
}
