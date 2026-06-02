package LinkedList;

import java.util.*;

public class Addition {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);

        int i = 0;
        if (l1.size() == l2.size()) {
            while (i < l1.size()) {
                res.add(l1.get(i) + l2.get(i));
                i++;
            }
        }

        else
            System.out.println("Addition not possible");

        System.out.println(res);
    }
}
