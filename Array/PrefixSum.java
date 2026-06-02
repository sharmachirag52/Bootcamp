package Array;
import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
        int p[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        p[0] = a[0];

        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1] + a[i];
        }

        int l = sc.nextInt();
        int r = sc.nextInt();

        int sum = p[r] - p[l - 1];

        System.out.println("Sum = " + sum);

        sc.close();
    }
}