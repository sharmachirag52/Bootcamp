package Array;
import java.util.Scanner;

public class DelSmallElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int pos = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                pos = i;
            }
        }

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}