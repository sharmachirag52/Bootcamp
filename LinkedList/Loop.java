package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Loop {
    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;

        d.next = b;

        Node slow = a;
        Node fast = a;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Cycle Found");
                return;
            }
        }

        System.out.println("No Cycle");
    }
}