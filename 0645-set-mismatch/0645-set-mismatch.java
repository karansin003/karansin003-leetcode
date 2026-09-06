import java.util.Arrays;

class Solution {

    public int[] findErrorNums(int[] nums) {

        int[] ans = new int[2];

        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n - 1; i++) {

            // Duplicate
            if (nums[i] == nums[i + 1]) {
                ans[0] = nums[i];
            }

            // Missing in between
            if (nums[i + 1] > nums[i] + 1) {
                ans[1] = nums[i] + 1;
            }
        }

        // Missing number is at beginning or end
        if (ans[1] == 0) {
            if (nums[0] != 1) {
                ans[1] = 1;
            } else {
                ans[1] = n;
            }
        }

        return ans;
    }
}