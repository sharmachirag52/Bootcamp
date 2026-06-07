package StacknQueue;
import java.util.*;
public class ReverseUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> q = new Stack<>();

        for(char ch : s.toCharArray()){
            q.push(ch);
        }

        while(!q.isEmpty()){
            System.out.print(q.pop());
        }
    }
}
