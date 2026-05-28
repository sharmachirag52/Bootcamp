import java.util.Scanner;

public class Sorts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (a[mid] == 0) {
                int t = a[low];
                a[low] = a[mid];
                a[mid] = t;

                low++;
                mid++;
            }
            else if (a[mid] == 1) {
                mid++;
            }
            else {
                int t = a[mid];
                a[mid] = a[high];
                a[high] = t;

                high--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}