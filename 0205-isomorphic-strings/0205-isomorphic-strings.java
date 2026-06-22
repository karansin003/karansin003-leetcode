class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            char v = t.charAt(i);
            if (map.containsKey(k)) {
                if ((map.get(k) != v)) {
                    return false;
                }
            } else {
                if (hs.contains(v)) {
                    return false;
                }
            }
            map.put(k, v);
            hs.add(v);
        }
        return true;
    }
}