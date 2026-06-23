class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total = 0;
        for(int num : nums)
        {
            total+=num;
        }
        int leftSum = 0,rigthSum = 0;
        for(int i = 0; i < nums.length;i++)
        {
            int current = nums[i];
            rigthSum = total - leftSum - nums[i];
            nums[i] = Math.abs(rigthSum-leftSum);
            leftSum+=current;
        }
        return nums;
    }
}