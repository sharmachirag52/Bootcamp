package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);

        int n = sc.nextInt();

        if (n <= l.size())
            l.remove(n - 1);

        else {
            System.out.println("Deletion not possible.");
            return;
        }

        System.out.println(l);
    }
}
