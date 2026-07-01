class Solution {
    public String replaceDigits(String s) {
        char ch[] = s.toCharArray();
        for(int i = 1; i < ch.length; i += 2)
        {
            int shift = ch[i] - '0';
            ch[i] = (char)(ch[ i - 1] + shift);
        }
        return new String(ch);
    }
}