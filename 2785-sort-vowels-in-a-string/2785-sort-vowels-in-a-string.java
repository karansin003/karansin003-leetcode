class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                list.add(c);
            }
        }

        Collections.sort(list);

        StringBuilder ans = new StringBuilder(s);
        int j = 0;

        for (int i = 0; i < ans.length(); i++) {
            if ("aeiouAEIOU".indexOf(ans.charAt(i)) != -1) {
                ans.setCharAt(i, list.get(j));
                j++;
            }
        }

        return ans.toString();
    }
}