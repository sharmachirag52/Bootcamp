package LinkedList;
import java.util.*;

public class Removekth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);

        int k = sc.nextInt();

        if(k <= l.size()) l.remove(k-1);
        else{
            System.out.println("Not Possible.");
            return;
        }

        System.out.println(l);
    }

}
