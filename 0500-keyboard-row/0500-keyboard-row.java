class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for (String word : words) {
            String lower = word.toLowerCase();
            String row;
            char first = lower.charAt(0);
            if (row1.indexOf(first) != -1) {
                row = row1;
            } else if (row2.indexOf(first) != -1) {
                row = row2;
            } else {
                row = row3;
            }
            boolean valid = true;
            for (char ch : lower.toCharArray()) {
                if (row.indexOf(ch) == -1) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}