class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        int rightsum = 0; 
        for(int i  : nums)
        {
            rightsum+=i;
        }

        for(int i = 0 ; i < nums.length;i++)
        {
            int val = nums[i];
            rightsum -= val;
            if(leftsum == rightsum)
            {
                return i;
            }
            leftsum += val;
        }
        return -1;
    }
}