class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums1)
        {
            set.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2)
        {
            if(set.contains(i))
            {
                list.add(i);
                set.remove(i);
            }
        }

        int [] array = new int[list.size()];
        for(int i = 0;i < list.size();i++ )
        {
            array[i] = list.get(i);
        }
        return array;
    }
}