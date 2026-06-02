package LinkedList;

import java.util.*;

public class ChangeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);

        int n = sc.nextInt();
        int val = sc.nextInt();

        l.remove(n - 1);
        l.add(n - 1, val);

        System.out.println(l);
    }
}
