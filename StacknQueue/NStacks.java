package StacknQueue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class NStacks {

    Node[] top;

    NStacks(int n) {
        top = new Node[n];
    }

    void push(int stackNo, int data) {

        Node newNode = new Node(data);

        newNode.next = top[stackNo];
        top[stackNo] = newNode;
    }

    void pop(int stackNo) {

        if (top[stackNo] == null) {
            System.out.println("Stack Empty");
            return;
        }

        System.out.println("Deleted: " + top[stackNo].data);
        top[stackNo] = top[stackNo].next;
    }

    void peek(int stackNo) {

        if (top[stackNo] == null)
            System.out.println("Stack Empty");
        else
            System.out.println("Top: " + top[stackNo].data);
    }

    void display(int stackNo) {

        Node temp = top[stackNo];

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        NStacks s = new NStacks(3);

        s.push(0, 10);
        s.push(0, 20);
        s.push(0, 30);

        s.push(1, 40);
        s.push(1, 50);

        s.push(2, 60);
        s.push(2, 70);

        s.display(0);
        s.display(1);
        s.display(2);

        s.pop(1);

        s.peek(1);
    }
}