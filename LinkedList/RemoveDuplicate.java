package LinkedList;

import java.util.LinkedList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(5);
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(15);
        l.add(15);
        l.add(20);
        l.add(20);

        int i = 0;
        int j = 1;
        while (j < l.size()) {
            if (l.get(i) == l.get(j)) {
                l.remove(j);
            }

            else {
                i++;
                j++;
            }
        }

        System.out.println(l);

    }
}
