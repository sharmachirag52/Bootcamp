package String;
public class ShortestPalindrome {

    static boolean isPalindrome(String str) {

        int i = 0, j = str.length() - 1;

        while(i < j) {
            if(str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "abcd";

        if(isPalindrome(str)) {
            System.out.println(str);
            return;
        }

        for(int i = str.length() - 1; i >= 0; i--) {

            String temp = str.substring(0, i + 1);

            if(isPalindrome(temp)) {

                String add = "";

                for(int j = str.length() - 1; j > i; j--)
                    add += str.charAt(j);

                System.out.println("Shortest Palindrome: " + add + str);
                break;
            }
        }
    }
}