class Solution {
    private boolean isvawerl(String word)
    {
        char f = word.charAt(0);
        char l = word.charAt(word.length() - 1);
        boolean fb = false;
        boolean lb = false;
        if(f == 'a'|| f == 'e'||f == 'i'|| f == 'o'|| f == 'u')
        fb = true;
        if(l == 'a'|| l == 'e'||l == 'i'|| l == 'o'|| l == 'u')
        lb = true;
        
        return fb && lb;
    }
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i = left ; i <= right;i++)
        {
            String word = words[i];
            if(isvawerl(word))
            {
                count++;
            }
        }
        return count;
    }
}