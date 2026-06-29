class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> st = new Stack<>();
       for(char ch : s.toCharArray())
       {
        if(!st.isEmpty() && ch == st.peek())
        {
            st.pop();
            continue;
        }
        st.push(ch);
       }
       StringBuilder sb = new StringBuilder();
       while(!st.isEmpty())
       {
        sb.append(st.pop());
       }
        return sb.reverse().toString();
    }
}