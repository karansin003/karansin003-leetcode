class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> st = new HashSet<>();
        for(int i : nums)
        {
            st.add(i);
        }
        int maxCount = 0;
        for(int i : st)
        {
            if(!st.contains(i-1))
            {
                int count = 1;
                int temp = i;
                while (st.contains(temp+1)) {
                    count++;
                    temp++;
                }
                maxCount = Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
}