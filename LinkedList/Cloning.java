package LinkedList;

import java.util.LinkedList;

public class Cloning {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(5);
        l1.add(10);
        l1.add(15);
        l1.add(20);
        l1.add(25);

        for (int i = 0; i < l1.size(); i++) {
            l2.add(l1.get(i));
        }

        System.out.println(l1);
        System.out.println(l2);
    }
}
