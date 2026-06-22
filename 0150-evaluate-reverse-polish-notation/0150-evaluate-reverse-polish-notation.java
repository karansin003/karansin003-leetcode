class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String s : tokens) {

            if (s.equals("+")) {
                int b = st.pop();
                int a = st.pop();
                int res = a + b;
                st.push(res);
            }
            else if (s.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                int res = a - b;
                st.push(res);
            }
            else if (s.equals("*")) {
                int b = st.pop();
                int a = st.pop();
                int res = a * b;
                st.push(res);
            }
            else if (s.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                int res = a / b;
                st.push(res);
            }
            else{
                st.push((Integer.parseInt(s)));
            }

        }
        return st.pop();

    }
}