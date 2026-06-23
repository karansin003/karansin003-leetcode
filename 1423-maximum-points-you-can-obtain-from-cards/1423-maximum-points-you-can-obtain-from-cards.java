class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int total = 0;
        for (int x : cardPoints) {
            total += x;
        }

        int windowSize = n - k;

        if (windowSize == 0) {
            return total;
        }

        int windowSum = 0;

        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minSum = windowSum;

        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i];
            windowSum -= cardPoints[i - windowSize];

            minSum = Math.min(minSum, windowSum);
        }

        return total - minSum;
    }
}