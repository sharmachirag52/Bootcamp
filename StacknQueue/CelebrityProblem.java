package StacknQueue;

import java.util.Stack;

public class CelebrityProblem {

    public static void main(String[] args) {

        int[][] M = {{0, 1, 1, 0},{0, 0, 0, 0},{0, 1, 0, 0},{0, 1, 1, 0}};

        int n = M.length;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        while (st.size() > 1) {

            int a = st.pop();
            int b = st.pop();

            if (M[a][b] == 1)
                st.push(b);
            else
                st.push(a);
        }

        int c = st.pop();

        boolean celebrity = true;

        for (int i = 0; i < n; i++) {

            if (i != c &&
                (M[c][i] == 1 || M[i][c] == 0)) {
                celebrity = false;
                break;
            }
        }

        if (celebrity)
            System.out.println("Celebrity = " + c);
        else
            System.out.println("No Celebrity");
    }
}