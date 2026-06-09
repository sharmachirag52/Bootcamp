package Array;
import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[n - 1];

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] >= max) {
                System.out.print(a[i] + " ");
                max = a[i];
            }
        }

    }
}
