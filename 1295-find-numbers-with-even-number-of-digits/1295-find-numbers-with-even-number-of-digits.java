class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums)
        {
            int n = 0;
            while(num != 0)
            {
                num /= 10;
                n++;
            }
            if ( n % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
}