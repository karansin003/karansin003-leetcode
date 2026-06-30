class Solution {
    public String reverseWords(String s) {
        String[] ans = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String s1 : ans)
        {
            StringBuilder sb = new StringBuilder(s1);
            result.append(sb.reverse()).append(" ");
        }
        return result.toString().trim();
    }
}