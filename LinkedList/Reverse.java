package LinkedList;

import java.util.LinkedList;

public class Reverse {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);

        System.out.println("Original Order");

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }

        System.out.println();

        System.out.println("Reverse Order");
        
        for (int i = l.size() - 1; i >= 0; i--) {
            System.out.print(l.get(i) + " ");
        }

    }
}
