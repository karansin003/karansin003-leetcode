class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            } else {
                st1.push(ch);
            }
        }

        Stack<Character> st2 = new Stack<>();

        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (!st2.isEmpty()) {
                    st2.pop();
                }
            } else {
                st2.push(ch);
            }
        }

        if (st1.size() != st2.size()) {
            return false;
        }

        while (!st1.isEmpty()) {
            if (st1.pop() != st2.pop()) {
                return false;
            }
        }

        return true;
    }
}