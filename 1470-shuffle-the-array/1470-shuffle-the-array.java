class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res [] = new int[n * 2];
        int k = 0;
        for(int i = 0 ; i < n ; i++)
        {
            res[k++] = nums[i];
            res[k++] = nums[i + n];
        }
        return res;
    }
}