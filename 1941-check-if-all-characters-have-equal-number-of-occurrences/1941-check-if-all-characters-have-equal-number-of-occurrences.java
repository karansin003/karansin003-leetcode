class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
         int frequency = 0;

        for (int count : map.values()) {
            if (frequency == 0) {
                frequency = count;
            } else if (count != frequency) {
                return false;
            }
        }

        return true;
    }
}