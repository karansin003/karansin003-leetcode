class MyStack {
Stack<Integer> st;
    public MyStack() {
      st = new Stack<Integer>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */