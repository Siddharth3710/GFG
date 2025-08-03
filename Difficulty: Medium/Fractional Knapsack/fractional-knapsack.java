class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        double[][] ratio = new double[n][2];

        for (int i = 0; i < n; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) values[i] / weights[i]; 
        }

        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        double totalValue = 0.0;
        int w = W;

        for (int i = 0; i < n; i++) {
            int idx = (int) ratio[i][0]; 

            if (w >= weights[idx]) { 
                totalValue += values[idx];
                w -= weights[idx];
            } else {
                totalValue += ratio[i][1] * w;
                break;
            }
        }

        return totalValue;
    }
}
