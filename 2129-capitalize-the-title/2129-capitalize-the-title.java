class Solution {
    public String capitalizeTitle(String title) {
        String s[] = title.toLowerCase().split(" ");
        for(int i = 0; i < s.length;i++)
        {
            if(s[i].length() > 2)
            {
                s[i] = Character.toUpperCase(s[i].charAt(0)) + s[i].substring(1);
            }
        }
        return String.join(" ",s);
    }
}