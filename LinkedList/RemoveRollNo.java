package LinkedList;

import java.util.*;

public class RemoveRollNo {
    static boolean check(int a, int k) {
        if (a / 100 == k)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            l.add(a);
        }

        int k = sc.nextInt();

        for (int i = 0; i < l.size(); i++) {
            if (check(l.get(i), k)) {
                l.remove(i);
                i--;
            }
        }

        System.out.println(l);

    }
}
