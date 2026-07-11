class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String arr[] = text.split(" ");
        for (String s : arr) {
            boolean flag = true;
            for (char ch : brokenLetters.toCharArray()) {
                if (s.indexOf(ch) != -1) {
                    flag = false;
                }
            }
            if(flag == true)
            {
                count++;
            }
        }
        return count;
    }
}