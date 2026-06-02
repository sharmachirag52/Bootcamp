package LinkedList;

import java.util.*;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            l.add(a);

            if (l.getLast() == -1)
                break;
        }

        System.out.println(l.size() - 1);
    }
}
