class Solution {
    public String toGoatLatin(String sentence) {
        String words[] = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.charAt(0) == 'a' || word.charAt(0) == 'A' || word.charAt(0) == 'e' || word.charAt(0) == 'E'
                    || word.charAt(0) == 'i' || word.charAt(0) == 'I' || word.charAt(0) == 'o' || word.charAt(0) == 'O'
                    || word.charAt(0) == 'u' || word.charAt(0) == 'U') {

                word = word + "ma";
            } else {
                word = word.substring(1) + word.charAt(0) + "ma";
            }

            word += "a".repeat(i + 1);

            words[i] = word;
        }

    return String.join(" ",words);
    }
}