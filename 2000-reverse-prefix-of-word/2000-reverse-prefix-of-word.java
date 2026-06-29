class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if(idx == -1)
        {
            return word;
        }
        char ans[] = word.toCharArray();
        int i = 0;
        int j = idx;
        while(i < j)
        {
            char temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
        return new String(ans);
    }

}