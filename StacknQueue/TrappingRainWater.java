package StacknQueue;

import java.util.Stack;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] h = {4, 2, 0, 3, 2, 5};

        Stack<Integer> st = new Stack<>();

        int water = 0;

        for (int i = 0; i < h.length; i++) {

            while (!st.isEmpty() && h[i] > h[st.peek()]) {

                int top = st.pop();

                if (st.isEmpty())
                    break;

                int distance = i - st.peek() - 1;

                int height = Math.min(h[i], h[st.peek()]) - h[top];

                water += distance * height;
            }

            st.push(i);
        }

        System.out.println("Water Trapped = " + water);
    }
}