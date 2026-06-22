class Solution {
    public boolean isGood(int[] nums) {
        int m=0;
        for(int i :nums )
        {
            m = Math.max(m,i);
        }

        if(nums.length != m+1)
        {
        return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :nums )
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
       
        for(int key : map.keySet())
        {
            if(key == m)
            {
                if(map.get(key)!= 2)
                {
                    return false;
                }

            }
            else
            {
                if(map.get(key)!= 1)
                {
                    return false;
                }

            }
        }
        return true;
    }
}