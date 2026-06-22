class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());
        ArrayList<String> res = new ArrayList<>();
        list.sort((a, b) -> {

            if (map.get(a).equals(map.get(b))) {
                return a.compareTo(b);
            }

            return map.get(b) - map.get(a);
        });

        for (int i = 0; i < k; i++) {
            res.add(list.get(i));
        }

        return res;
    }
}