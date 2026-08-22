class Solution {
    public List<Integer> findMissingElements(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    List<Integer> list = new ArrayList<>();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int i : nums)
    {
        set.add(i);
        min = Math.min(min,i);
        max = Math.max(max,i);
    }
    for(int i = min ; i <= max; i++)
    {
        if(!set.contains(i))
        {
            list.add(i);
        }
    }
    return list;
    
    }
}