package Array;

import java.util.*;

public class SumOfArrayRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 4, 6, 8, 3, 9, 2, 7, 5 };

        System.out.println("Enter Range");
        System.out.print("From : ");
        int f = sc.nextInt();
        System.out.print("To : ");
        int t = sc.nextInt();

        int sum = 0;
        for (int i = f; i <= t && i < a.length; i++) {
            sum += a[i];
        }

        System.out.println(sum);

    }
}
