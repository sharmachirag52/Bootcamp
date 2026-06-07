package StacknQueue;

import java.util.Stack;

public class ImplementTwoStacksInArray {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        st1.push(5);
        st1.push(10);
        st1.push(15);
        st1.push(20);

        st2.push(25);
        st2.push(30);
        st2.push(35);
        st2.push(40);

        int n = st1.size() + st2.size();

        int[] a = new int[n];

        int i = 0;
        while(i < n){
            while(!st1.isEmpty()){
                a[i] = st1.pop();
                i++;
            }

            while(!st2.isEmpty()){
                a[i] = st2.pop();
                i++;
            }
        }

        for(int x : a){
            System.out.print(x+" ");
        }
    }
}
