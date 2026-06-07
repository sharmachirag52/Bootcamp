package StacknQueue;
import java.util.Stack;

public class BalanceParanthesis {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = "((())))";
        char[] ch = s.toCharArray();

        for(char x : ch){
            if(x=='(') st.push(x);

            else{
                if(st.isEmpty()){
                    System.out.println("not valid.");
                    return;
                }

                st.pop();
            }
        }

        System.out.println("Valid.");

    }
}
