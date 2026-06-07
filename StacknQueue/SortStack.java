package StacknQueue;

import java.util.*;

public class SortStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> s = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        while (!s.isEmpty()) {

            int x = s.pop();

            while (!temp.isEmpty() && temp.peek() > x) {
                s.push(temp.pop());
            }

            temp.push(x);
        }

        System.out.println("Sorted Stack:");

        while (!temp.isEmpty()) {
            System.out.print(temp.pop() + " ");
        }
    }
}