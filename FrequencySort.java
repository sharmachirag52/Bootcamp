import java.util.Scanner;

public class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int f[] = new int[50];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            f[a[i]]++;
        }

        for (int i = 0; i < 50; i++) {
            if (f[i] > 0) {
                while (f[i] > 0) {
                    System.out.print(i + " ");
                    f[i]--;
                }
            }
        }
    }
}
