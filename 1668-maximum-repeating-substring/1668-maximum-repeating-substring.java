class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String rep = word;
        while(sequence.contains(rep))
        {
            count++;
            rep += word;
        }
        return count;
    }
}