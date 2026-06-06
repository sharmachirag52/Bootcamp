package Array;

public class FractionalKnapsack {

    public static void main(String[] args) {

        int[] weight = {10, 20, 30};
        int[] profit = {60, 100, 120};
        int capacity = 50;

        double totalProfit = 0;

        for (int i = 0; i < weight.length - 1; i++) {
            for (int j = i + 1; j < weight.length; j++) {

                double r1 = (double) profit[i] / weight[i];
                double r2 = (double) profit[j] / weight[j];

                if (r1 < r2) {

                    int temp = weight[i];
                    weight[i] = weight[j];
                    weight[j] = temp;

                    temp = profit[i];
                    profit[i] = profit[j];
                    profit[j] = temp;
                }
            }
        }

        for (int i = 0; i < weight.length; i++) {

            if (capacity >= weight[i]) {
                totalProfit += profit[i];
                capacity -= weight[i];
            } else {
                totalProfit += ((double) profit[i] / weight[i]) * capacity;
                break;
            }
        }

        System.out.println("Maximum Profit = " + totalProfit);
    }
}