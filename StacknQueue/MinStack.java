package StacknQueue;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    void push(int val) {

        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    void pop() {

        if (stack.isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }

        int x = stack.pop();

        if (x == minStack.peek()) {
            minStack.pop();
        }
    }

    int top() {
        return stack.peek();
    }

    int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack s = new MinStack();

        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);

        System.out.println("Min: " + s.getMin());

        s.pop();

        System.out.println("Min: " + s.getMin());
    }
}