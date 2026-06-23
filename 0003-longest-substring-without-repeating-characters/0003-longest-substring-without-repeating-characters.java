class Solution {
    public int lengthOfLongestSubstring(String s) {
    StringBuilder sb = new StringBuilder();
    int maxcount = 0;
    for(int i = 0 ; i < s.length();i++)
    {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int j = i; j < s.length(); j++)
        {
            if(set.contains(s.charAt(j)))
            {
                break;
            }
            set.add(s.charAt(j));
            count++;
        }
        maxcount = Math.max(maxcount,count);
        
    }
    return maxcount;
    }
}