class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> bannedSet = new HashSet<>();

        for (String word : banned) {
            bannedSet.add(word);
        }

        String[] words = paragraph.toLowerCase().split("[^a-z]+");
        String ans = "";
        int maxcount = 0;
        for (String word : words) {
            if (word.isEmpty() || bannedSet.contains(word)) {
                continue;
            }
            int count = map.getOrDefault(word, 0) + 1;
            map.put(word, count);
            if (count > maxcount) {
                maxcount = count;
                ans = word;
            }
        }
        return ans;
    }
}