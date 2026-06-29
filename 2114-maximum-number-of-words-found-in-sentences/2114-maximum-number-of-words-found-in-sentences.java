class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxlen = -1;
        for(String s : sentences)
        {
            String[] words = s.split(" ");
            maxlen = Math.max(maxlen,words.length);
        }
        return maxlen;
    }
}