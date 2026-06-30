class Solution {
    public boolean halvesAreAlike(String s) {
        String s1 = s.substring(0, s.length() / 2).toLowerCase();
        String s2 = s.substring(s.length() / 2, s.length()).toLowerCase();
        int fre = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i'
                    || ch1 == 'o' || ch1 == 'u') {
                fre++;
            }
            if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i'
                    || ch2 == 'o' || ch2 == 'u') {
                fre--;
            }
        }
        if(fre == 0 )
        {
            return true;
        }
        else {
           return  false;
        }
    }
}