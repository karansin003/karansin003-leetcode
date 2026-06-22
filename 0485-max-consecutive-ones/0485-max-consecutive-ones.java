class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,res = 0;
        for(int num : nums)
        {
            if( num == 1 )
            {
                count++;
            }
            else 
            {
                count = 0;
            }
           res = Math.max(res,count);
        }
        
        return res;
    }
}