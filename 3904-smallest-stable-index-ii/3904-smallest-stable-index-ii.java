class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int maxarr[] = new int[n];
        int minarr[] = new int[n];
        maxarr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            maxarr[i] = Math.max(nums[i], maxarr[i - 1]);
        }
        minarr[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--)
        {
            minarr[i] = Math.min(nums[i],minarr[i + 1]);
        }
        for(int i = 0; i < n ; i++)
        {
            int score = maxarr[i] - minarr[i];
            if(score <= k)
            {
                return i;
            }
        }
        return -1;
    }
}