class Solution {
    public int minimumSwaps(int[] nums) {
        int count = 0;
        int s = 0;
        int e = nums.length - 1;
        while(s < e )
        {
           while (s < e && nums[s] != 0) {
                s++;
            }
           while (s < e && nums[e] == 0) {
                e--;
            }
           if (s < e )
           {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            count++;
            s++;
            e--;
           }
        }
        return count;
    }
}