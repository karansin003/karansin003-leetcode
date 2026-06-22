class Solution {
    public int minElement(int[] nums) {
        int minsum = Integer.MAX_VALUE;
       for(int num : nums) 
       {
        int sum = 0;
        while(num > 0)
        {
            sum = sum + num%10;
            num/=10;
        }
        minsum = Math.min(sum,minsum);
       }
       return minsum;
    }
}