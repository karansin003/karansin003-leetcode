class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        for(int key : list)
        {
            if(key == map.get(key))
            {
                return key;
            }
        }
        return -1;
    }
}