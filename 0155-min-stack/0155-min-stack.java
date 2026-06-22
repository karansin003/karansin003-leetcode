class MinStack {

    public MinStack() {
        Stack<Integer> main = new Stack<>();
        Stack<Integer> minstack = new Stack<>();
    }
    
    public void push(int val) {
        main.push(val);
        if(minstack.isEmpty()|| val <= minstack.peek())
        {
            minstaack.push();
        }

    }
    
    public void pop() {
        main.pop();
        if(main.peek()== minstack.peek())
        {
            minstack.pop();
        }
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */