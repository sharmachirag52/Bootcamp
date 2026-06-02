package LinkedList;

import java.util.*;

public class Middle {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);

        if (l.size() % 2 != 0)
            System.out.println(l.get(l.size() / 2));

        else
            System.out.println("No middle Element");

    }
}
