class Solution {
    public int minOperations(String s) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length(); i++) {
            char expected1;
            char expected2;

            if (i % 2 == 0) {
                expected1 = '0';
                expected2 = '1';
            } else {
                expected1 = '1';
                expected2 = '0';
            }

            if (s.charAt(i) != expected1) {
                count1++;
            }

            if (s.charAt(i) != expected2) {
                count2++;
            }
        }

        return Math.min(count1, count2);
    }
}