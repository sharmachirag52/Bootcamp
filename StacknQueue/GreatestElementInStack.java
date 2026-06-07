package StacknQueue;

import java.util.*;

public class GreatestElementInStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }

        int max = st.peek();

        for(int x : st) {
            if(x > max)
                max = x;
        }

        System.out.println(max);
    }
}