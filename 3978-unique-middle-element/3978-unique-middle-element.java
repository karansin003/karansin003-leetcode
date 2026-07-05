class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums[nums.length / 2];
        int count = 0;
        for(int num : nums)
        {
            if(num == mid)
            {
                count++;
            }
            if(count > 1)
            {
                return false;
            }
        }
        return true;
    }
}