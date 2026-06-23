class Solution {
    public boolean canConstruct(String r, String m) {
        if(r.length() > m.length())
        {
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : r.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : m.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.getOrDefault(ch,2)-1);
            }
        }

        for(char key : map.keySet())
        {
            if(map.get(key) > 0)
            {
                return false;
            }
        }
        return true;
    }
}