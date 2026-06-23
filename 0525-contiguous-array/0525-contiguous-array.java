class Solution {
    public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int sum = 0;
        int maxlength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                maxlength = Math.max(length, maxlength);
            }
            else
            {
                map.put(sum,i);
            }
        }
        return maxlength;
    }
}