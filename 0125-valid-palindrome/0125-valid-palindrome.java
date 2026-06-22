class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        if (s.isEmpty()) {
            return true;
        }
        int j = s.length() - 1, i = 0;
        while (i < j) {
            if(s.charAt(i)!= s.charAt(j))
            {
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}