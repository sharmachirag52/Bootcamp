package LinkedList;

import java.util.*;

public class RemoveDuplicateUS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        LinkedList<Integer> r = new LinkedList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            l.add(a);
        }

        for (int i = l.size() - 1; i >= 0; i--) {
            if (!r.contains(l.get(i)))
                r.add(l.get(i));
        }

        for (int i = 0; i < r.size(); i++) {
            System.out.print(r.get(i) + " ");
        }
    }
}
