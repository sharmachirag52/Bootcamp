package String;
import java.util.Scanner;

public class RotateString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Enter Position: ");
        int n = sc.nextInt();

        System.out.print("Enter Direction (L/R): ");
        char ch = sc.next().charAt(0);

        n = n % str.length();

        if(ch == 'L')
            str = str.substring(n).toUpperCase() + str.substring(0, n);
        else
            str = str.substring(str.length() - n).toUpperCase() +
                  str.substring(0, str.length() - n);

        System.out.println(str);
    }
}