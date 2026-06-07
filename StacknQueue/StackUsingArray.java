package StacknQueue;

public class StackUsingArray {

    int[] stack = new int[5];
    int top = -1;

    void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = data;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Deleted: " + stack[top--]);
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Top Element: " + stack[top]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack Empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        StackUsingArray s = new StackUsingArray();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();

        s.peek();
    }
}