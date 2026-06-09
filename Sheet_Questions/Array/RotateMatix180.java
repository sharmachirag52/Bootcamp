package Array;
import java.util.Scanner;

public class RotateMatix180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int t = a[i][j];
                a[i][j] = a[n - 1 - i][n - 1 - j];
                a[n - 1 - i][n - 1 - j] = t;
            }
        }

        if (n % 2 != 0) {
            int mid = n / 2;

            for (int j = 0; j < n / 2; j++) {
                int t = a[mid][j];
                a[mid][j] = a[mid][n - 1 - j];
                a[mid][n - 1 - j] = t;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}