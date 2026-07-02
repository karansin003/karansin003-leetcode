class Solution {
    public boolean isCircularSentence(String sentence) {
        String s[] = sentence.split(" ");
        for (int i = 1; i < s.length; i++) {
            String first = s[i - 1];
            String second = s[i];
            if (second.charAt(0) != first.charAt(first.length() - 1)) {
                return false;
            }
        }
        String first = s[0];
        String second = s[s.length - 1];
        return first.charAt(0) == second.charAt(second.length() - 1);
    }
}