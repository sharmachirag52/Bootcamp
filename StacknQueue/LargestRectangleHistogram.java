package StacknQueue;

import java.util.Stack;

public class LargestRectangleHistogram {

    public static void main(String[] args) {

        int[] h = {2, 1, 5, 6, 2, 3};

        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int i = 0;

        while (i < h.length) {

            if (st.isEmpty() || h[st.peek()] <= h[i]) {
                st.push(i++);
            } else {

                int top = st.pop();

                int area;

                if (st.isEmpty())
                    area = h[top] * i;
                else
                    area = h[top] * (i - st.peek() - 1);

                maxArea = Math.max(maxArea, area);
            }
        }

        while (!st.isEmpty()) {

            int top = st.pop();

            int area;

            if (st.isEmpty())
                area = h[top] * i;
            else
                area = h[top] * (i - st.peek() - 1);

            maxArea = Math.max(maxArea, area);
        }

        System.out.println("Maximum Area = " + maxArea);
    }
}