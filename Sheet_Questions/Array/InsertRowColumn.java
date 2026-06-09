package Array;

import java.util.Scanner;

public class InsertRowColumn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        System.out.println("1. Insert Row");
        System.out.println("2. Insert Column");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter row position: ");
            int pos = sc.nextInt();

            int[][] b = new int[4][3];

            for (int i = 0, k = 0; i < 4; i++) {

                if (i == pos) {
                    System.out.println("Enter 3 elements:");
                    for (int j = 0; j < 3; j++)
                        b[i][j] = sc.nextInt();
                } else {
                    for (int j = 0; j < 3; j++)
                        b[i][j] = a[k][j];
                    k++;
                }
            }

            System.out.println("New Matrix:");

            for (int[] row : b) {
                for (int x : row)
                    System.out.print(x + " ");
                System.out.println();
            }
        }

        else if (choice == 2) {

            System.out.print("Enter column position: ");
            int pos = sc.nextInt();

            int[][] b = new int[3][4];

            System.out.println("Enter 3 column elements:");

            int[] col = new int[3];
            for (int i = 0; i < 3; i++)
                col[i] = sc.nextInt();

            for (int i = 0; i < 3; i++) {

                int k = 0;

                for (int j = 0; j < 4; j++) {

                    if (j == pos)
                        b[i][j] = col[i];
                    else
                        b[i][j] = a[i][k++];
                }
            }

            System.out.println("New Matrix:");

            for (int[] row : b) {
                for (int x : row)
                    System.out.print(x + " ");
                System.out.println();
            }
        }
    }
}