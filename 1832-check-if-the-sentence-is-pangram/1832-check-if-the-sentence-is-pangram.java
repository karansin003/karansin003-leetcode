class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26 ) return false;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i < sentence.length();i++)
        {
            char ch = sentence.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                set.add(ch);
            }
        }
        return set.size() == 26;
    }
}