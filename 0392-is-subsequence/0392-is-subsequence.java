class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = -1;
        for(char ch : s.toCharArray())
        {
            idx = t.indexOf(ch,idx + 1);
            if(idx == -1)
            {
                return false;
            }
        }
            return true;
    }
}