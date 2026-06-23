class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0,newsum = 0,n = nums.length;
        for(int i :nums)
        {
            sum +=i;
        }
        newsum = n * (n+1)/2;
        return newsum-sum;
    }
}