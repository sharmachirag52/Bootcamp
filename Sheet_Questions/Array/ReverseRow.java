package Array;
import java.util.Scanner;

public class ReverseRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            int s = 0;
            int e = c - 1;

            while (s < e) {
                int temp = arr[i][s];
                arr[i][s] = arr[i][e];
                arr[i][e] = temp;

                s++;
                e--;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}