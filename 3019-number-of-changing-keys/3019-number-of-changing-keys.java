class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        String snew = s.toLowerCase();
        for(int i = 0; i < s.length() - 1;i++ )
        {
            if(snew.charAt(i) != snew.charAt(i + 1))
            {
                count++;
            }
        }
        return count;
    }
}