package Array;

public class RodCutting {

    public static void main(String[] args) {

        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = 8;

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            int max = 0;

            for (int j = 0; j < i; j++) {
                max = Math.max(max, price[j] + dp[i - j - 1]);
            }

            dp[i] = max;
        }

        System.out.println("Maximum Profit = " + dp[n]);
    }
}