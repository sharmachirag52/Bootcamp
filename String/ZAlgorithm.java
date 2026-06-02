package String;
public class ZAlgorithm {

    public static void main(String[] args) {

        String str = "aabcaabxaaaz";
        int n = str.length();
        int[] z = new int[n];

        for(int i = 1; i < n; i++) {

            int count = 0;
            int j = 0;
            int k = i;

            while(k < n && str.charAt(j) == str.charAt(k)) {
                count++;
                j++;
                k++;
            }

            z[i] = count;
        }

        System.out.print("Z Array: ");

        for(int i = 0; i < n; i++) {
            System.out.print(z[i] + " ");
        }
    }
}