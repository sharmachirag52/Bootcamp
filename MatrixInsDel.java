import java.util.Scanner;

public class MatrixInsDel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("1.Insert Row");
        System.out.println("2.Delete Row");

        int ch = sc.nextInt();

        if (ch == 1) {

            int p = sc.nextInt();

            int b[][] = new int[r + 1][c];

            for (int i = 0; i < r + 1; i++) {

                if (i == p) {
                    for (int j = 0; j < c; j++) {
                        b[i][j] = sc.nextInt();
                    }
                }
                else {
                    int x;

                    if (i < p)
                        x = i;
                    else
                        x = i - 1;

                    for (int j = 0; j < c; j++) {
                        b[i][j] = a[x][j];
                    }
                }
            }

            for (int i = 0; i < r + 1; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(b[i][j] + " ");
                }

                System.out.println();
            }
        }

        else if (ch == 2) {

            int p = sc.nextInt();

            for (int i = 0; i < r; i++) {

                if (i == p)
                    continue;

                for (int j = 0; j < c; j++) {
                    System.out.print(a[i][j] + " ");
                }

                System.out.println();
            }
        }

        sc.close();
    }
}