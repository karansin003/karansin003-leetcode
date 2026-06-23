class Solution {
    public int sumOfGoodIntegers(int n, int k) {

        int sum = 0;

        for (int x = Math.max(1, n - k); x <= n + k; x++) {

            if ((n & x) == 0) {
                sum += x;
            }
        }

        return sum;
    }
}