class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(String s : words)
        {
            boolean valid = true;
            for(char ch : s.toCharArray())
            {
                if(allowed.indexOf(ch) == -1)
                {
                    valid = false;
                    break;
                }
            }
                if(valid)
                {
                    count++;
                }
        }
        return count;
    }
}