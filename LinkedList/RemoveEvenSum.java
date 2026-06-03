package LinkedList;

import java.util.*;

public class RemoveEvenSum {
    static boolean check(int a) {
        int k = a;
        int sum = 0;
        while (k != 0) {
            sum += k % 10;
            k /= 10;
        }

        if (sum % 2 == 0)
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

        for (int i = 0; i < l.size(); i++) {
            if (check(l.get(i))) {
                l.remove(i);
                i--;
            }
        }

        System.out.println(l);

    }
}
