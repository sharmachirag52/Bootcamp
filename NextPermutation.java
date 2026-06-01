import java.util.Scanner;

public class NextPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        int i = arr.length - 2;

        while(i >= 0 && arr[i] >= arr[i + 1])
            i--;

        if(i == -1) {
            System.out.println("No Next Permutation");
            return;
        }

        int j = arr.length - 1;

        while(arr[j] <= arr[i])
            j--;

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        int start = i + 1;
        int end = arr.length - 1;

        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Next Permutation: " + new String(arr));
    }
}