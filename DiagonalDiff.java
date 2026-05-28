import java.util.Scanner;

public class DiagonalDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int d1 = 0;
        int d2 = 0;

        for (int i = 0; i < n; i++) {
            d1 += a[i][i];
            d2 += a[i][n - 1 - i];
        }

        int diff = d1 - d2;

        if (diff < 0) {
            diff *= -1;
        }

        System.out.println(diff);

        sc.close();
    }
}