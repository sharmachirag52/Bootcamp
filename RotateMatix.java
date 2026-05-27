import java.util.Scanner;

public class RotateMatix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }

        for (int i = 0; i < n; i++) {
            int s = 0;
            int e = n - 1;

            while (s < e) {
                int t = a[i][s];
                a[i][s] = a[i][e];
                a[i][e] = t;

                s++;
                e--;
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