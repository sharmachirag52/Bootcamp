package String;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] > b[j]) {
                    char temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        boolean flag = true;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        sc.close();
    }
}