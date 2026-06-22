class Solution {
    public String addSpaces(String s, int[] spaces) {

        int j = 0;

        StringBuilder str = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {

            if(j < spaces.length && i == spaces[j]) {
                str.append(" ");
                j++;
            }

            str.append(s.charAt(i));
        }

        return str.toString();
    }
}