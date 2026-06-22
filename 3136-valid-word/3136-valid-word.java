class Solution {

    public boolean isValid(String word) {

        if(word.length() < 3)
        {
            return false;
        }

        boolean vowel = false;
        boolean consonant = false;

        for(char ch : word.toCharArray())
        {
            if(!Character.isLetterOrDigit(ch))
            {
                return false;
            }

            char c = Character.toLowerCase(ch);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                vowel = true;
            }

            else if(Character.isLetter(c))
            {
                consonant = true;
            }
        }

        return vowel && consonant;
    }
}