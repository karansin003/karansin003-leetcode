import java.util.*;

class Solution {
    public long maximumSum(int[] nums, int m, int l, int r) {

        int[] qerunavilo = nums;

        int n = nums.length;

        long[] pref = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + nums[i];
        }

        long NEG = Long.MIN_VALUE / 4;

        long[][] dp = new long[m + 1][n + 1];

        for (int j = 0; j <= m; j++) {
            Arrays.fill(dp[j], NEG);
        }

        for (int i = 0; i <= n; i++) {
            dp[0][i] = 0;
        }

        long ans = Long.MIN_VALUE;

        for (int used = 1; used <= m; used++) {

            Deque<Integer> dq = new ArrayDeque<>();

            for (int i = 1; i <= n; i++) {

                dp[used][i] = dp[used][i - 1];

                int add = i - l;

                if (add >= 0 && dp[used - 1][add] != NEG) {

                    long value = dp[used - 1][add] - pref[add];

                    while (!dq.isEmpty()) {
                        int last = dq.peekLast();

                        long lastValue =
                                dp[used - 1][last] - pref[last];

                        if (lastValue >= value) break;

                        dq.pollLast();
                    }

                    dq.offerLast(add);
                }

                int leftBound = i - r;

                while (!dq.isEmpty() && dq.peekFirst() < leftBound) {
                    dq.pollFirst();
                }

                if (!dq.isEmpty()) {

                    int best = dq.peekFirst();

                    long candidate =
                            pref[i]
                            + (dp[used - 1][best] - pref[best]);

                    dp[used][i] =
                            Math.max(dp[used][i], candidate);
                }

                ans = Math.max(ans, dp[used][i]);
            }
        }

        return ans;
    }
}