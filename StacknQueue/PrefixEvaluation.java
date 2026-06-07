package StacknQueue;

import java.util.Stack;

public class PrefixEvaluation {

    public static void main(String[] args) {

        String exp = "+9*26";

        Stack<Integer> st = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {

            char ch = exp.charAt(i);

            if (Character.isDigit(ch))
                st.push(ch - '0');

            else {

                int a = st.pop();
                int b = st.pop();

                switch (ch) {
                    case '+': st.push(a + b); break;
                    case '-': st.push(a - b); break;
                    case '*': st.push(a * b); break;
                    case '/': st.push(a / b); break;
                }
            }
        }

        System.out.println(st.pop());
    }
}