package Array;

public class MatrixOperation {

    public static void main(String[] args) {

        int[][] a = {{1, 2, 3},{4, 5, 6},{7, 8, 9},{10, 11, 12}};

        int r = a.length;
        int c = a[0].length;

        for (int i = 0; i < r; i += 2) {
            for (int j = 0; j < c; j++) {
                a[i][j] = -a[i][j];
            }
        }

        for (int j = 0; j < c; j++) {
            int temp = a[0][j];
            a[0][j] = a[2][j];
            a[2][j] = temp;
        }

        System.out.println("Result Matrix:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}