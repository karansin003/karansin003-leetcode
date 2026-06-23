class Solution {
    public int largestAltitude(int[] gain) {
        int pre  = 0;
        int max = 0;
        for(int i : gain)
        {
            int sum = pre + i;
            max = Math.max(max,sum);
            pre = sum;
        }
        return max;
    }
}