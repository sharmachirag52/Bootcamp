package String;
public class KMP {

    public static void main(String[] args) {

        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";

        int index = text.indexOf(pattern);

        if(index != -1)
            System.out.println("Pattern Found at Index: " + index);
        else
            System.out.println("Pattern Not Found");
    }
}