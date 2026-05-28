import java.util.Scanner;

public class LongestSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }

        System.out.println("Length = " + max);

        sc.close();
    }
}