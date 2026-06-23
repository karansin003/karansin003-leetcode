class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans [] = new  int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack();
        for(int i = 0; i < nums2.length;i++)
        {
            while(!st.isEmpty() && st.peek() < nums2[i])
            {
                map.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }
        for(int i : st)
        {
            map.put(i,-1);
        }
        for(int i = 0 ; i < ans.length;i++)
        {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}