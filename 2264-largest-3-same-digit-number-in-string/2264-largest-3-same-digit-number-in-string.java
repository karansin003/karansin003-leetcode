class Solution {
    public String largestGoodInteger(String num) {
        String answer = "";

        for (int i = 0; i <= num.length() - 3; i++) {
            char first = num.charAt(i);
            char second = num.charAt(i + 1);
            char third = num.charAt(i + 2);

            if (first == second && second == third) {
                String current = num.substring(i, i + 3);

                if (answer.isEmpty() || current.compareTo(answer) > 0) {
                    answer = current;
                }
            }
        }

        return answer;
    }
}