package LinkedList;

import java.util.LinkedList;

public class Palindrome {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(2);
        l.add(1);

        int h = 0;
        int t = l.size() - 1;

        boolean bool = true;

        while (h < t) {
            if (l.get(h) != l.get(t)) {
                bool = false;
                break;
            }
            h++;
            t--;
        }

        if (bool)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

    }
}
