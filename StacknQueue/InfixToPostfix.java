package StacknQueue;

import java.util.Stack;

public class InfixToPostfix {

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return -1;
    }

    public static void main(String[] args) {

        String exp = "A+B*C";
        String result = "";

        Stack<Character> st = new Stack<>();

        for (char ch : exp.toCharArray()) {

            if (Character.isLetterOrDigit(ch))
                result += ch;

            else {
                while (!st.isEmpty() &&
                       precedence(st.peek()) >= precedence(ch)) {
                    result += st.pop();
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty())
            result += st.pop();

        System.out.println("Postfix: " + result);
    }
}