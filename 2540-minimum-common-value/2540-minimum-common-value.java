class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
    HashSet<Integer> st = new HashSet<>();
    for(int i : nums2)
    {
        st.add(i);
    }
   Arrays.sort(nums1);
    for(int i : nums1)
    {
        if(st.contains(i))
        {
            return i;
        }
    }
    return -1;
    }
}