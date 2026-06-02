package String;
public class StringComparison {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        if(str1.length() != str2.length()) {
            System.out.println("Strings are Not Equal");
            return;
        }

        boolean flag = true;

        for(int i = 0; i < str1.length(); i++) {

            if(str1.charAt(i) != str2.charAt(i)) {
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("Strings are Equal");
        else
            System.out.println("Strings are Not Equal");
    }
}