class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(!st.isEmpty() && Math.abs(st.peek() - ch) == 32)
            {
                st.pop();
                continue;
            }
            st.push(ch);
        }
        StringBuilder sb  = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}