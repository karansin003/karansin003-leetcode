class Solution {
    public int minimumCost(int[] cost) {
        
        Arrays.sort(cost);
        int total = 0,count = 0;
        for(int i = cost.length -1 ;i >= 0 ;i--)
        {
            count++;
            if(count == 3)
            {
                count = 0;
                continue;
            }
            total += cost[i];
        }
        return total;
    }
}