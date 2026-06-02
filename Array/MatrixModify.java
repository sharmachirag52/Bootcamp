package Array;
import java.util.Scanner;

public class MatrixModify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int a[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < n; j++) {
                a[i][j] *= -1;
            }

            if (i == n - 1) {
                for (int j = 0; j < n; j++) {
                    int temp = a[i][j];
                    a[i][j] = a[0][j];
                    a[0][j] = temp;
                }
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
