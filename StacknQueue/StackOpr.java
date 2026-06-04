package StacknQueue;

import java.util.*;

public class StackOpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();

        while(true){
            int choice  = sc.nextInt();
            switch (choice) {
                case 1:
                    char ch = sc.next().charAt(0);
                    System.out.println("Adding Section: "+st.push(ch));
                    break;

                case 2:
                    if(!st.isEmpty()){
                        System.out.println("Removing Section: "+st.pop());
                    }
                    else System.out.println("Stack is Empty!");
                    break;

                case 3:
                    if(!st.isEmpty()){
                        for(char x : st){
                            System.out.print(x+" ");
                        }
                    }
                    else System.out.println("Stack is Empty!");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;
                                
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
    }
}
