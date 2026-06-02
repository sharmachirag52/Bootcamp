package String;
public class ValidParentheses {

    public static void main(String[] args) {

        String str = "((()))";

        int open = 0, close = 0;

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '(')
                open++;
            else if(str.charAt(i) == ')')
                close++;
        }

        if(open == close)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}