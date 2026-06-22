class Solution {
    public int numberOfSpecialChars(String word) {
    HashSet<Character> st = new HashSet<>();
    for(char ch : word.toCharArray())
    {
        st.add(ch);
    }
    int count = 0; 
    for(char ch : st)
    {
        if(Character.isLowerCase(ch) &&
               st.contains(Character.toUpperCase(ch)))
        {
            count++;
        }
        
    }
    return count;
    }
}