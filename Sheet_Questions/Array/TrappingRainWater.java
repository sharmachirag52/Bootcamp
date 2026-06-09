package Array;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] h = {4, 2, 0, 3, 2, 5};
        int n = h.length;

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = h[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], h[i]);
        }

        right[n - 1] = h[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], h[i]);
        }

        int water = 0;

        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - h[i];
        }

        System.out.println("Water Trapped = " + water);
    }
}