class Solution {
    private boolean isValid(long sum ,int x)
    {
        int ld = (int) (sum %10);
        if(ld != x)
        {
            return false;
        }
        while(sum >= 10)
            {
                sum /=10;
            }
        int fd = (int)sum;
        return x == fd;
    }
    public int countValidSubarrays(int[] nums, int x) {
    long count = 0;
        for(int i = 0;i < nums.length;i++)
            {
                long sum = 0;
                for(int j = i; j < nums.length;j++)
                    {
                        sum+=nums[j];
                        if(isValid(sum,x))
                        {
                            count++;
                        }
                    }
            }
        return (int)count;
    }
}