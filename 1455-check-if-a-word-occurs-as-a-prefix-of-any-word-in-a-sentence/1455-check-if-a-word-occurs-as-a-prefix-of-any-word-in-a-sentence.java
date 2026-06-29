class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] ans = sentence.split(" ");
        for(int i = 0 ; i < ans.length;i++)
        {
            if(ans[i].startsWith(searchWord))
            {
                return i+1;
            }
        }
        return -1;
    }
}