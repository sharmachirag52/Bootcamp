package StacknQueue;

import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();

        String s = sc.nextLine();
        char[] ch = s.toCharArray();

        for (char x : ch) {
            if (x == ' ') {
                while (!st.isEmpty()) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
            st.push(x);
        }

        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }
}
