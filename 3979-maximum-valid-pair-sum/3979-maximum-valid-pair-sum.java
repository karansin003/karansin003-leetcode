class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxLeft = Integer.MIN_VALUE;
        int answer = Integer.MIN_VALUE;

        for (int j = k; j < nums.length; j++) {
            // Index j-k becomes eligible for the current j
            maxLeft = Math.max(maxLeft, nums[j - k]);

            // Best eligible left value + current right value
            answer = Math.max(answer, maxLeft + nums[j]);
        }

        return answer;
    }
}