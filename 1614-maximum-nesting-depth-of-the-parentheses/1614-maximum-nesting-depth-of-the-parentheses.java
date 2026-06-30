class Solution {
    public int maxDepth(String s) {
        int depth = 0,maxdepth = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                depth++;
                maxdepth = Math.max(maxdepth,depth);
            }
            else if (ch == ')')
            {
                depth--;
            }
        }
        return maxdepth;
    }
}