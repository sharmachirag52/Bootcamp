package String;
public class RabinKarp {

    public static void main(String[] args) {

        String text = "HELLO WORLD";
        String pattern = "WORLD";

        int index = text.indexOf(pattern);

        if(index != -1)
            System.out.println("Pattern Found at Index: " + index);
        else
            System.out.println("Pattern Not Found");
    }
}