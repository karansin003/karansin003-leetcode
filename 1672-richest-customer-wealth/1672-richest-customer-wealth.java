class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] num : accounts)
        {
            int sum = 0;
            for(int i = 0; i < num.length;i++)
            {
                sum+=num[i];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}