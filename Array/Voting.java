package Array;
import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int f[] = new int[100];

        int th = n / 4;

        for(int i=0;i<n;i++){
            f[a[i]]++;
        }

        for(int i=0;i<n;i++){
            if(f[i]>th){
                System.out.println(i);
                return;
            }
        }

        System.out.println("No Candidate found having vote more than n/4.");

        sc.close();
    }
}